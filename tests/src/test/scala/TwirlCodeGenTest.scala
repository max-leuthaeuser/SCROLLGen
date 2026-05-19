import generator.CROMGenerator
import importer.CROMImporter
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers

class TwirlCodeGenTest extends AnyFeatureSpec with Matchers {
  info("Test spec for generating code out of an CROM model instance.")

  private def loadModel(resource: String) =
    new CROMImporter(getClass.getResource(resource).getPath).loadModel()

  private def loadExpected(resource: String): String =
    scala.io.Source.fromResource(resource).mkString.replace("\r\n", "\n")

  scenario("Generating code from a valid model without case classes") {
    val expected  = loadExpected("expected/bank-false.txt")
    val generated = new CROMGenerator(false).generate(loadModel("/Bank.crom")).replace("\r\n", "\n")
    generated shouldBe expected
  }

  scenario("Generating code from a valid model with case classes") {
    val expected  = loadExpected("expected/bank-true.txt")
    val generated = new CROMGenerator(true).generate(loadModel("/Bank.crom")).replace("\r\n", "\n")
    generated shouldBe expected
  }

  scenario("Generating code from the base test CROM") {
    val expected  = loadExpected("expected/base-true.txt")
    val generated = new CROMGenerator(true).generate(loadModel("/baseTest2.crom")).replace("\r\n", "\n")
    generated shouldBe expected
  }
}
