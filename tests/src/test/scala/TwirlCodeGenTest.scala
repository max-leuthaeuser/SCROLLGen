import generator.CROMGenerator
import importer.CROMImporter
import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}

class TwirlCodeGenTest extends FeatureSpec with GivenWhenThen with Matchers {
  info("Test spec for generating code out of an CROM model instance.")

  scenario("Generating code from a valid model without case classes") {
    val expected =
      """import scroll.internal.support.DispatchQuery
        |import DispatchQuery._
        |import scroll.internal.Compartment
        |import scroll.internal.util.Many._
        |
        |object CROMApplication extends App {
        |
        |  class Money {
        |
        |    var value: Unit = ???
        |
        |    var currency: Unit = ???
        |
        |    def add(o: Money): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    def sub(o: Money): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    def mult(o: Unit): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |  }
        |
        |  class Person {
        |
        |    var address: Unit = ???
        |
        |    var lastName: Unit = ???
        |
        |    var firstName: Unit = ???
        |
        |    var title: Unit = ???
        |
        |  }
        |
        |  class Company {
        |
        |    var addresses: Unit = ???
        |
        |    var POBox: Unit = ???
        |
        |    var legalFrom: Unit = ???
        |
        |    var name: Unit = ???
        |
        |  }
        |
        |  class Account {
        |
        |    var id: Unit = ???
        |
        |    var balance: Money = ???
        |
        |    def decrease(amount: Money): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    def increase(amount: Money): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    def getBalance(): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |  }
        |
        |  class Alien {
        |
        |    var nouble: Unit = ???
        |
        |  }
        |
        |  class Bank extends Compartment {
        |    import Relationship._
        |
        |    var name: Unit = ???
        |
        |    def executeTransactions(): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    def login(id: Unit, cred: Unit): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    class Customer {
        |
        |    }
        |
        |    class Consultant {
        |
        |      var phone: Unit = ???
        |
        |    }
        |
        |    class SavingsAccount {
        |
        |    }
        |
        |    class CheckingAccount {
        |
        |    }
        |
        |    class MoneyTransfer {
        |
        |    }
        |
        |    RoleGroup("BankAccounts").containing[SavingsAccount, CheckingAccount](1, 1)(2, 2)
        |
        |    val own_ca = Relationship("own_ca").from[Customer](1).to[CheckingAccount](0 To *)
        |
        |    val own_sa = Relationship("own_sa").from[Customer](1 To *).to[SavingsAccount](0 To *)
        |
        |    val advices = Relationship("advices").from[Consultant](*).to[Customer](*)
        |
        |    AddRoleRestriction[Company, Customer]
        |
        |    AddRoleRestriction[Person, Customer]
        |
        |    AddRoleRestriction[Person, Consultant]
        |
        |    AddRoleRestriction[Account, SavingsAccount]
        |
        |    AddRoleRestriction[Account, CheckingAccount]
        |
        |    AddRoleRestriction[Alien, Customer]
        |
        |    AddRoleRestriction[Transaction, MoneyTransfer]
        |  }
        |
        |  class Transaction extends Compartment {
        |    import Relationship._
        |
        |    var creationTime: Unit = ???
        |
        |    var amount: Money = ???
        |
        |    def execute(): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    class Target {
        |
        |      def deposite(amount: Money): Unit = {
        |        // TODO: auto-generated method-stub. Implement!
        |      }
        |    }
        |
        |    class Source {
        |
        |      def withdraw(amount: Money): Unit = {
        |        // TODO: auto-generated method-stub. Implement!
        |      }
        |    }
        |
        |    RoleProhibition[Source, Target]()
        |
        |    val transfer = Relationship("transfer").from[Source](1).to[Target](1)
        |
        |    AddRoleRestriction[Account, Target]
        |
        |    AddRoleRestriction[Account, Source]
        |  }
        |
        |}""".stripMargin

    val path = getClass.getResource("/Bank.crom").getPath

    When("A specific valid CROM instance is given")
    val model = new CROMImporter(path).loadModel()

    Then("code should be generated correctly")
    new CROMGenerator(false).generate(model) shouldBe expected
  }

  scenario("Generating code from a valid model with case classes") {
    val expected =
      """import scroll.internal.support.DispatchQuery
        |import DispatchQuery._
        |import scroll.internal.Compartment
        |import scroll.internal.util.Many._
        |
        |object CROMApplication extends App {
        |
        |  case class Money(value: Unit, currency: Unit) {
        |
        |    def add(o: Money): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    def sub(o: Money): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    def mult(o: Unit): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |  }
        |
        |  case class Person(address: Unit, lastName: Unit, firstName: Unit, title: Unit) {
        |
        |  }
        |
        |  case class Company(addresses: Unit, POBox: Unit, legalFrom: Unit, name: Unit) {
        |
        |  }
        |
        |  case class Account(id: Unit, balance: Money) {
        |
        |    def decrease(amount: Money): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    def increase(amount: Money): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    def getBalance(): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |  }
        |
        |  case class Alien(nouble: Unit) {
        |
        |  }
        |
        |  case class Bank(name: Unit) extends Compartment {
        |    import Relationship._
        |
        |    def executeTransactions(): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    def login(id: Unit, cred: Unit): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    case class Customer() {
        |
        |    }
        |
        |    case class Consultant(phone: Unit) {
        |
        |    }
        |
        |    case class SavingsAccount() {
        |
        |    }
        |
        |    case class CheckingAccount() {
        |
        |    }
        |
        |    case class MoneyTransfer() {
        |
        |    }
        |
        |    RoleGroup("BankAccounts").containing[SavingsAccount, CheckingAccount](1, 1)(2, 2)
        |
        |    val own_ca = Relationship("own_ca").from[Customer](1).to[CheckingAccount](0 To *)
        |
        |    val own_sa = Relationship("own_sa").from[Customer](1 To *).to[SavingsAccount](0 To *)
        |
        |    val advices = Relationship("advices").from[Consultant](*).to[Customer](*)
        |
        |    AddRoleRestriction[Company, Customer]
        |
        |    AddRoleRestriction[Person, Customer]
        |
        |    AddRoleRestriction[Person, Consultant]
        |
        |    AddRoleRestriction[Account, SavingsAccount]
        |
        |    AddRoleRestriction[Account, CheckingAccount]
        |
        |    AddRoleRestriction[Alien, Customer]
        |
        |    AddRoleRestriction[Transaction, MoneyTransfer]
        |  }
        |
        |  case class Transaction(creationTime: Unit, amount: Money) extends Compartment {
        |    import Relationship._
        |
        |    def execute(): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |
        |    case class Target() {
        |
        |      def deposite(amount: Money): Unit = {
        |        // TODO: auto-generated method-stub. Implement!
        |      }
        |    }
        |
        |    case class Source() {
        |
        |      def withdraw(amount: Money): Unit = {
        |        // TODO: auto-generated method-stub. Implement!
        |      }
        |    }
        |
        |    RoleProhibition[Source, Target]()
        |
        |    val transfer = Relationship("transfer").from[Source](1).to[Target](1)
        |
        |    AddRoleRestriction[Account, Target]
        |
        |    AddRoleRestriction[Account, Source]
        |  }
        |
        |}""".stripMargin

    val path = getClass.getResource("/Bank.crom").getPath

    When("A specific valid CROM instance is given")
    val model = new CROMImporter(path).loadModel()

    Then("code should be generated correctly")
    new CROMGenerator(true).generate(model) shouldBe expected
  }

  scenario("Generating code from the base test CROM") {
    val expected =
      """import scroll.internal.support.DispatchQuery
        |import DispatchQuery._
        |import scroll.internal.Compartment
        |import scroll.internal.util.Many._
        |
        |object CROMApplication extends App {
        |
        |  case class SubNaturalA(AttributeSubNatA: Unit) extends NaturalA {
        |
        |  }
        |
        |  case class NaturalA(AttributeNatA: Unit) {
        |
        |    def OperationNatA(): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |    }
        |  }
        |
        |  case class CompartmentA() extends Compartment {
        |    import Relationship._
        |
        |    case class RoleF() {
        |
        |    }
        |
        |    case class RoleE() {
        |
        |    }
        |
        |    case class RoleG() {
        |
        |    }
        |
        |    case class RoleH() {
        |
        |    }
        |
        |    case class RoleJ() {
        |
        |    }
        |
        |    case class RoleK() {
        |
        |    }
        |
        |    RoleGroup("RoleGroupA").containing[RoleG, RoleH, RoleJ, RoleK](1, *)(4, 4)
        |
        |    val RelF = Relationship("RelF").from[RoleH](0 To 1).to[RoleK](1 To *)
        |
        |    AddRoleRestriction[NaturalA, RoleG]
        |
        |    AddRoleRestriction[NaturalA, RoleH]
        |
        |    AddRoleRestriction[NaturalA, RoleJ]
        |
        |    AddRoleRestriction[NaturalA, RoleK]
        |  }
        |
        |  case class CompartmentB() extends Compartment {
        |    import Relationship._
        |
        |    case class RoleA() {
        |
        |    }
        |
        |    case class RoleB() {
        |
        |    }
        |
        |    case class RoleC() {
        |
        |    }
        |
        |    case class RoleD() {
        |
        |    }
        |
        |    val RelA = Relationship("RelA").from[RoleA](1).to[RoleB](0 To *)
        |
        |    val RelD = Relationship("RelD").from[RoleA](0 To *).to[RoleC](0 To *)
        |
        |    val RelE = Relationship("RelE").from[RoleA](0 To *).to[RoleD](0 To *)
        |
        |    val RelB = Relationship("RelB").from[RoleB](0 To 1).to[RoleD](1 To *)
        |
        |    val RelC = Relationship("RelC").from[RoleD](1 To *).to[RoleC](1)
        |
        |    AddRoleRestriction[NaturalA, RoleA]
        |
        |    AddRoleRestriction[NaturalA, RoleB]
        |
        |    AddRoleRestriction[NaturalA, RoleC]
        |
        |    AddRoleRestriction[NaturalA, RoleD]
        |  }
        |
        |}""".stripMargin

    val path = getClass.getResource("/baseTest2.crom").getPath

    When("A specific valid CROM instance is given")
    val model = new CROMImporter(path).loadModel()

    Then("code should be generated correctly")
    new CROMGenerator(true).generate(model) shouldBe expected
  }

}
