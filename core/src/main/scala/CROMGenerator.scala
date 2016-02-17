import crom_l1_composed.Model
import template.txt.CROM

class CROMGenerator extends Generator[Model] {
  override def generate(model: Model): String = CROM(model).toString().trim
}
