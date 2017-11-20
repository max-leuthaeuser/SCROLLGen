import generator.CROMGenerator
import importer.CROMImporter
import org.scalatest.{Matchers, GivenWhenThen, FeatureSpec}

class TwirlCodeGenTest extends FeatureSpec with GivenWhenThen with Matchers {
  info("Test spec for generating code out of an CROM model instance.")

  scenario("Generating code from a a valid model without case classes") {
    val expected =
      """import scroll.internal.annotations.Role
        |import scroll.internal.support.DispatchQuery
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
        |      ???
        |    }
        |
        |    def sub(o: Money): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
        |    }
        |
        |    def mult(o: Unit): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
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
        |      ???
        |    }
        |
        |    def increase(amount: Money): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
        |    }
        |
        |    def getBalance(): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
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
        |      ???
        |    }
        |
        |    def login(id: Unit, cred: Unit): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
        |    }
        |
        |    @Role class Customer {
        |
        |    }
        |
        |    @Role class Consultant {
        |
        |      var phone: Unit = ???
        |
        |    }
        |
        |    @Role class SavingsAccount {
        |
        |    }
        |
        |    @Role class CheckingAccount {
        |
        |    }
        |
        |    @Role class MoneyTransfer {
        |
        |    }
        |
        |    RoleGroup("BankAccounts").containing[SavingsAccount, CheckingAccount](1, 1)(2, 2)
        |
        |    val own_ca = Relationship("own_ca").from[Customer](1).to[CheckingAccount](1)
        |
        |    val own_sa = Relationship("own_sa").from[Customer](1 To *).to[SavingsAccount](1 To *)
        |
        |    val advices = Relationship("advices").from[Consultant](*).to[Customer](*)
        |
        |    RoleRestriction[Company, Customer]
        |
        |    RoleRestriction[Person, Customer]
        |
        |    RoleRestriction[Person, Consultant]
        |
        |    RoleRestriction[Account, SavingsAccount]
        |
        |    RoleRestriction[Account, CheckingAccount]
        |
        |    RoleRestriction[Alien, Customer]
        |
        |    RoleRestriction[Transaction, MoneyTransfer]
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
        |      ???
        |    }
        |
        |    @Role class Target {
        |
        |      def deposite(amount: Money): Unit = {
        |        // TODO: auto-generated method-stub. Implement!
        |        ???
        |      }
        |    }
        |
        |    @Role class Source {
        |
        |      def withdraw(amount: Money): Unit = {
        |        // TODO: auto-generated method-stub. Implement!
        |        ???
        |      }
        |    }
        |
        |    RoleProhibition[Source, Target]()
        |
        |    val transfer = Relationship("transfer").from[Source](1).to[Target](1)
        |
        |    RoleRestriction[Account, Target]
        |
        |    RoleRestriction[Account, Source]
        |  }
        |
        |}""".stripMargin

    val path = getClass.getResource("/Bank.crom").getPath

    When("A specific valid CROM instance is given")
    val model = new CROMImporter(path).loadModel()

    Then("code should be generated correctly")
    new CROMGenerator(false).generate(model) shouldBe expected
  }

  scenario("Generating code from a a valid model with case classes") {
    val expected =
      """import scroll.internal.annotations.Role
        |import scroll.internal.support.DispatchQuery
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
        |      ???
        |    }
        |
        |    def sub(o: Money): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
        |    }
        |
        |    def mult(o: Unit): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
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
        |      ???
        |    }
        |
        |    def increase(amount: Money): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
        |    }
        |
        |    def getBalance(): Money = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
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
        |      ???
        |    }
        |
        |    def login(id: Unit, cred: Unit): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
        |    }
        |
        |    @Role case class Customer() {
        |
        |    }
        |
        |    @Role case class Consultant(phone: Unit) {
        |
        |    }
        |
        |    @Role case class SavingsAccount() {
        |
        |    }
        |
        |    @Role case class CheckingAccount() {
        |
        |    }
        |
        |    @Role case class MoneyTransfer() {
        |
        |    }
        |
        |    RoleGroup("BankAccounts").containing[SavingsAccount, CheckingAccount](1, 1)(2, 2)
        |
        |    val own_ca = Relationship("own_ca").from[Customer](1).to[CheckingAccount](1)
        |
        |    val own_sa = Relationship("own_sa").from[Customer](1 To *).to[SavingsAccount](1 To *)
        |
        |    val advices = Relationship("advices").from[Consultant](*).to[Customer](*)
        |
        |    RoleRestriction[Company, Customer]
        |
        |    RoleRestriction[Person, Customer]
        |
        |    RoleRestriction[Person, Consultant]
        |
        |    RoleRestriction[Account, SavingsAccount]
        |
        |    RoleRestriction[Account, CheckingAccount]
        |
        |    RoleRestriction[Alien, Customer]
        |
        |    RoleRestriction[Transaction, MoneyTransfer]
        |  }
        |
        |  case class Transaction(creationTime: Unit, amount: Money) extends Compartment {
        |    import Relationship._
        |
        |    def execute(): Unit = {
        |      // TODO: auto-generated method-stub. Implement!
        |      ???
        |    }
        |
        |    @Role case class Target() {
        |
        |      def deposite(amount: Money): Unit = {
        |        // TODO: auto-generated method-stub. Implement!
        |        ???
        |      }
        |    }
        |
        |    @Role case class Source() {
        |
        |      def withdraw(amount: Money): Unit = {
        |        // TODO: auto-generated method-stub. Implement!
        |        ???
        |      }
        |    }
        |
        |    RoleProhibition[Source, Target]()
        |
        |    val transfer = Relationship("transfer").from[Source](1).to[Target](1)
        |
        |    RoleRestriction[Account, Target]
        |
        |    RoleRestriction[Account, Source]
        |  }
        |
        |}""".stripMargin

    val path = getClass.getResource("/Bank.crom").getPath

    When("A specific valid CROM instance is given")
    val model = new CROMImporter(path).loadModel()

    Then("code should be generated correctly")
    new CROMGenerator(true).generate(model) shouldBe expected
  }

}
