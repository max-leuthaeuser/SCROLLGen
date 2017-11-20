import collection.JavaConverters._
import importer.CROMImporter
import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

class ECoreImporterTest extends FeatureSpec with GivenWhenThen with Matchers {
  info("Test spec for loading ECore CROM model instances.")

  scenario("Loading from a valid path containing a valid model") {
    val path = getClass.getResource("/Bank.crom").getPath

    When("A specific valid CROM instance is given")
    val model = new CROMImporter(path).loadModel()

    Then("it should be loaded correctly")
    val expected = List("Money", "Person", "Company", "Bank", "Transaction", "Account", "Alien")
    model.getElements.asScala.map(_.getName) shouldBe expected
  }

}
