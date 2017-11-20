package generator

import collection.JavaConverters._
import crom_l1_composed._
import templates.txt.CROMApplicationTemplate
import scalariform.formatter.ScalaFormatter

object CROMGenerator {

  def getFulfillments(comp: CompartmentType, model: Model): Traversable[Fulfillment] = {
    val roles = getRoles(comp)
    getFulfillments(model).filter(f => f.getFilled.isInstanceOf[RoleType] && roles.exists(r => r.getName == getName(f.getFilled)))
  }

  def getFulfillments(model: Model): Traversable[Fulfillment] =
    model.getRelations.asScala.filter(_.isInstanceOf[Fulfillment]).map(_.asInstanceOf[Fulfillment]).flatMap {
      case f: Fulfillment if f.getFilled.isInstanceOf[RoleGroup] => getRoles(f.getFilled.asInstanceOf[RoleGroup]).map(r => {
        val newFul = Crom_l1_composedFactory.eINSTANCE.createFulfillment()
        newFul.setFiller(f.getFiller)
        newFul.setFilled(r)
        newFul
      })
      case f: Fulfillment => List(f)
    }

  def placeToString(place: Place): String =
    if (place == null) {
      "*"
    }
    else {
      (place.getLower, place.getUpper) match {
        case (-1, -1) => "0 To *"
        case (l, -1) => l + " To *"
        case (l, u) if l == u => l.toString
        case (l, u) => l + " To " + u
      }
    }

  def getIncoming(t: RelationTarget): Traversable[Relationship] =
    t.getIncoming.asScala.filter(_.isInstanceOf[Relationship]).map(_.asInstanceOf[Relationship])

  def getOutgoing(t: RelationTarget): Traversable[Relationship] =
    t.getOutgoing.asScala.filter(_.isInstanceOf[Relationship]).map(_.asInstanceOf[Relationship])

  def getRelationships(t: RelationTarget, model: Model): Traversable[(NamedElement, NamedElement, Relationship)] =
    getOutgoing(t).flatMap(r => getCompartmentTypes(model).flatMap(getRelationshipTargets(_, model)).filter(getIncoming(_).toList.contains(r)).map(tt => {
      if (r.getFirst == null) {
        println(s" => Warning: Left multiplicity for relationship '${r.getName}' not specified! Setting it to '*'.")
      } else {
        (r.getFirst.getLower, r.getFirst.getUpper) match {
          case (-1, -1) => println(s" => Warning: Left multiplicity lower and upper bound for relationship '${r.getName}' not specified! Setting it to '0 To *'.")
          case (l, -1) => println(s" => Warning: Left multiplicity upper bound for relationship '${r.getName}' not specified! Setting it to '$l To *'.")
          case _ =>
        }
      }
      if (r.getSecond == null) {
        println(s" => Warning: Right multiplicity for relationship '${r.getName}' not specified! Setting it to '*'.")
      } else {
        (r.getSecond.getLower, r.getSecond.getUpper) match {
          case (-1, -1) => println(s" => Warning: Right multiplicity lower and upper bound for relationship '${r.getName}' not specified! Setting it to '0 To *'.")
          case (l, -1) => println(s" => Warning: Right multiplicity upper bound for relationship '${r.getName}' not specified! Setting it to '$l To *'.")
          case _ =>
        }
      }
      (t, tt, r)
    }))

  def getRelationshipTargets(comp: CompartmentType, model: Model): Traversable[RelationTarget] =
    getRoles(comp) ++ getNaturalTypes(model) ++ getDataTypes(model)

  def getName(ar: AbstractRole): String = ar match {
    case r: RoleType => r.getName
  }

  def getRoleConstraints(comp: CompartmentType): Traversable[(Constraint, String, String)] = comp.getConstraints.asScala.filter {
    case _: RoleEquivalence => true
    case _: RoleImplication => true
    case _: RoleProhibition => true
    case _ => false
  }.map(_.asInstanceOf[RoleConstraint]).flatMap {
    case c if c.getFirst.isInstanceOf[RoleType] && c.getSecond.isInstanceOf[RoleType] => List((c, getName(c.getFirst), getName(c.getSecond)))
    case c if c.getFirst.isInstanceOf[RoleType] && c.getSecond.isInstanceOf[RoleGroup] => getRoles(c.getSecond.asInstanceOf[RoleGroup]).flatMap(r => List((c, getName(c.getFirst), r.getName)))
    case c if c.getFirst.isInstanceOf[RoleGroup] && c.getSecond.isInstanceOf[RoleType] => getRoles(c.getFirst.asInstanceOf[RoleGroup]).flatMap(r => List((c, r.getName, getName(c.getSecond))))
  }

  def getLimitAndOcc(rg: RoleGroup): (String, String, String, String) = {
    def upperToString(c: Int) = c match {
      case -1 => println(s" => Warning: Upper bound for limit constraint of role-group '${rg.getName}' not specified! Setting it to '*'."); "*"
      case i: Int => i.toString
    }

    def lowerToString(c: Int) = c match {
      case -1 => println(s" => Warning: Lower bound for limit constraint of role-group '${rg.getName}' not specified! Setting it to '0'."); "0"
      case i: Int => i.toString
    }

    val roles = getRoles(rg).size.toString
    val limit = (lowerToString(rg.getLower), upperToString(rg.getUpper))
    val occ = (roles, roles)
    (limit._1, limit._2, occ._1, occ._2)
  }

  def getRoleGroups(comp: CompartmentType): Traversable[RoleGroup] = comp.getParts.asScala.map(_.getRole).flatMap {
    case _: RoleType => List.empty
    case rg: RoleGroup => List(rg) ++ getRoleGroups(rg)
  }

  def getRoleGroups(rg: RoleGroup): Traversable[RoleGroup] = rg.getElements.asScala.flatMap {
    case rg: RoleGroup => List(rg) ++ getRoleGroups(rg)
    case rf: AbstractRoleRef => getRoleGroups(rf)
    case _ => List.empty
  }

  def getRoleGroups(rf: AbstractRoleRef): Traversable[RoleGroup] = rf.getRef match {
    case rg: RoleGroup => List(rg) ++ getRoleGroups(rg)
    case _ => List.empty
  }

  def getRoles(comp: CompartmentType): Traversable[RoleType] = comp.getParts.asScala.map(_.getRole).flatMap {
    case rt: RoleType => List(rt)
    case rg: RoleGroup => getRoles(rg)
  }

  def getRoles(rg: RoleGroup): Traversable[RoleType] = rg.getElements.asScala.flatMap {
    case rt: RoleType => List(rt)
    case rg: RoleGroup => getRoles(rg)
    case ref: AbstractRoleRef => getRoles(ref)
  }

  def getRoles(rf: AbstractRoleRef): Traversable[RoleType] = rf.getRef match {
    case rt: RoleType => List(rt)
    case rg: RoleGroup => getRoles(rg)
  }

  def getCompartmentTypes(model: Model): Traversable[CompartmentType] =
    model.getElements.asScala.filter(_.isInstanceOf[CompartmentType]).map(_.asInstanceOf[CompartmentType])

  def getInheritances(model: Model): Traversable[Inheritance] =
    model.getRelations.asScala.filter(_.isInstanceOf[Inheritance]).map(_.asInstanceOf[Inheritance])

  def getParameters(elem: Operation): Traversable[Parameter] = elem.getParams.asScala.map(p => {
    p.getType match {
      case null => println(s" => Warning: Parameter '${p.getName}' for operation '${elem.getName}' does not have a type specified! Setting it to 'Unit'."); p
      case _ => p
    }
  })

  def getDataTypes(model: Model): Traversable[DataType] =
    model.getElements.asScala.filter(_.isInstanceOf[DataType]).map(_.asInstanceOf[DataType])

  def getNaturalTypes(model: Model): Traversable[NaturalType] =
    model.getElements.asScala.filter(_.isInstanceOf[NaturalType]).map(_.asInstanceOf[NaturalType])

  def getAttributes(model: Type): Traversable[Attribute] = model.getAttributes.asScala.map(a => {
    a.getType match {
      case null => println(s" => Warning: Attribute '${a.getName}' does not have a type specified! Setting it to 'Unit'."); a
      case _ => a
    }
  })

  def getOperations(model: Type): Traversable[Operation] = model.getOperations.asScala
}

class CROMGenerator(caseClass: Boolean) extends Generator[Model] {
  override def generate(model: Model): String = ScalaFormatter.format(CROMApplicationTemplate(model, caseClass).toString().trim)
}
