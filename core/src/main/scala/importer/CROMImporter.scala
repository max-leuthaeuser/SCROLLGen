package importer

import crom_l1_composed.{Crom_l1_composedPackage, Model}

class CROMImporter(p: String) extends ECoreImporter[Model] {
  path = p
  extension = "crom"
  this.packageInstance = Crom_l1_composedPackage.eINSTANCE
}
