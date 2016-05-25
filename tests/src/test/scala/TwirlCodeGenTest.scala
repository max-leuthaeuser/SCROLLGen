import generator.CROMGenerator
import importer.CROMImporter
import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}

class TwirlCodeGenTest extends FeatureSpec with GivenWhenThen with Matchers {
  info("Test spec for generating code out of an CROM model instance.")

  scenario("Generating code from a a valid model without case classes") {
    val path = getClass.getResource("/Bank.crom").getPath

    When("A specific valid CROM instance is given")
    val model = new CROMImporter(path).loadModel()

    Then("code should be generated correctly")
    println(new CROMGenerator(false).generate(model))
  }

  scenario("Generating code from a a valid model with case classes") {
    val path = getClass.getResource("/Bank.crom").getPath

    When("A specific valid CROM instance is given")
    val model = new CROMImporter(path).loadModel()

    Then("code should be generated correctly")
    println(new CROMGenerator(true).generate(model))
  }

}
