import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

class ECoreImporterTest extends FeatureSpec with GivenWhenThen with Matchers {
  info("Test spec for loading ECore CROM model instances.")

  scenario("Loading from a valid path containing a valid model") {
    val path = getClass.getResource("/Bank.crom").getPath

    When("A specific valid CROM instance is given")
    val model = new CROMImporter(path).loadModel()

    Then("it should be loaded correctly")
    val elems = model.getElements.iterator()
    while (elems.hasNext) {
      val e = elems.next
      println(e.getName)
    }
  }

}
