import crom_l1_composed.Crom_l1_composedPackage
import crom_l1_composed.Model

class CROMImporter(p: String) extends ECoreImporter[Model] {
  path = p
  extention = "crom"
  this.packageInstance = Crom_l1_composedPackage.eINSTANCE
}
