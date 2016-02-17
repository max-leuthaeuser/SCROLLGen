package generator

import crom_l1_composed._
import templates.txt.CROMApplicationTemplate

import scala.collection.JavaConversions._
import scalariform.formatter.ScalaFormatter

object CROMGenerator {

  def getRoles(comp: CompartmentType): Traversable[RoleType] = {
    comp.getParts.toList.map(_.getRole).flatMap {
      case rt: RoleType => List(rt)
      case rg: RoleGroup => getRoles(rg)
    }
  }

  def getRoles(rg: RoleGroup): Traversable[RoleType] = {
    rg.getElements.toList.flatMap {
      case rt: RoleType => List(rt)
      case rg: RoleGroup => getRoles(rg)
      case ref: AbstractRoleRef => getRoles(ref)
    }
  }

  def getRoles(comp: AbstractRoleRef): Traversable[RoleType] = {
    comp.getRef match {
      case rt: RoleType => List(rt)
      case rg: RoleGroup => getRoles(rg)
    }
  }

  def getCompartmentTypes(model: Model): Traversable[CompartmentType] =
    model.getElements.iterator().toList.filter(_.isInstanceOf[CompartmentType]).map(_.asInstanceOf[CompartmentType])

  def getInheritances(model: Model): Traversable[Inheritance] =
    model.getRelations.iterator().toList.filter(_.isInstanceOf[Inheritance]).map(_.asInstanceOf[Inheritance])

  def getParameters(elem: Operation): Traversable[Parameter] =
    elem.getParams.iterator().toList

  def getDataTypes(model: Model): Traversable[DataType] =
    model.getElements.iterator().toList.filter(_.isInstanceOf[DataType]).map(_.asInstanceOf[DataType])

  def getNaturalTypes(model: Model): Traversable[NaturalType] =
    model.getElements.iterator().toList.filter(_.isInstanceOf[NaturalType]).map(_.asInstanceOf[NaturalType])

  def getAttributes(model: Type): Traversable[Attribute] =
    model.getAttributes.iterator().toList

  def getOperations(model: Type): Traversable[Operation] =
    model.getOperations.iterator().toList
}

class CROMGenerator extends Generator[Model] {
  override def generate(model: Model): String = ScalaFormatter.format(CROMApplicationTemplate(model).toString().trim)
}
