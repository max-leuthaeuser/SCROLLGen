package generator

import crom_l1_composed._
import templates.txt.CROMApplicationTemplate

import scala.collection.JavaConversions._
import scalariform.formatter.ScalaFormatter

object CROMGenerator {
  def getExtends(dt: DataType): String = dt.getTr_extends match {
    case d: DataType => "extends " + d.getName
    case null => ""
  }

  def getExtends(nt: NaturalType): String = nt.getTr_extends match {
    case d: NaturalType => "extends " + d.getName
    case null => ""
  }

  def getType(elem: TypedElement): String = elem.getType match {
    case t: NamedElement => t.getName
    case null => "Unit"
  }

  def getParameters(elem: Operation): String =
    elem.getParams.iterator().toList.map(p => p.getName + ": " + getType(p)).mkString("(", ",", ")")

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
