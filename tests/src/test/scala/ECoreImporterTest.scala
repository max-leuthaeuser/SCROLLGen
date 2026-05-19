import scala.jdk.CollectionConverters._
import importer.CROMImporter
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers

class ECoreImporterTest extends AnyFeatureSpec with Matchers {
  info("Test spec for loading ECore CROM model instances.")

  scenario("Loading from a valid path containing a valid model") {
    val path = getClass.getResource("/Bank.crom").getPath

    val model = new CROMImporter(path).loadModel()

    val expected = List("Money", "Person", "Company", "Bank", "Transaction", "Account", "Alien")
    model.getElements.asScala.map(_.getName) shouldBe expected
  }

}
