package generator

import crom_l1_composed._
import templates.txt.CROMApplicationTemplate

import scala.collection.JavaConversions._
import scalariform.formatter.ScalaFormatter

object CROMGenerator {
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
