import generator.CROMGenerator
import importer.CROMImporter
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers

class TwirlCodeGenTest extends AnyFeatureSpec with Matchers {
  info("Test spec for generating code out of an CROM model instance.")

  private def loadModel(resource: String) =
    new CROMImporter(getClass.getResource(resource).getPath).loadModel()

  private def assertModernScrollApi(code: String): Unit = {
    code should include("import scroll.Compartment")
    code should include("import scroll.Many.*")
    code should not include "scroll.internal."
    code should not include "Relationship(\""
    code should not include "RoleGroup(\""
    code should not include "AddRoleRestriction["
    code should include("roleRelationships.create(")
    code should include("roleGroups.create(")
    code should include("roleRestrictions.addRoleRestriction[")
  }

  scenario("Generating code from a valid model without case classes") {
    val generated = new CROMGenerator(false).generate(loadModel("/Bank.crom"))

    assertModernScrollApi(generated)
    generated should include("class Bank extends Compartment")
    generated should include("roleGroups.create(\"BankAccounts\").containing[SavingsAccount,CheckingAccount](1, 1)(2, 2)")
    generated should include("roleConstraints.addRoleProhibition[Source, Target]()")
  }

  scenario("Generating code from a valid model with case classes") {
    val generated = new CROMGenerator(true).generate(loadModel("/Bank.crom"))

    assertModernScrollApi(generated)
    generated should include("case class Bank")
    generated should include("case class Transaction")
    generated should include("extends Compartment")
    generated should include("roleRelationships.create(\"transfer\").from[Source](1).to[Target](1)")
  }

  scenario("Generating code from the base test CROM") {
    val generated = new CROMGenerator(true).generate(loadModel("/baseTest2.crom"))

    assertModernScrollApi(generated)
    generated should include("case class CompartmentA")
    generated should include("roleGroups.create(\"RoleGroupA\").containing[RoleG,RoleH,RoleJ,RoleK](1, *)(4, 4)")
    generated should include("roleRestrictions.addRoleRestriction[NaturalA, RoleD]()")
  }
}
