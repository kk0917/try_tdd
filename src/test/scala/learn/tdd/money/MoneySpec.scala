package learn.tdd.money

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.GivenWhenThen

class MoneySpec extends AnyFeatureSpec with GivenWhenThen {
  /** TODO:
   * [ ] $5 + 10CHF = $10 (when rate is 2:1 between $ and CHF)
   * [x] $5 * 2 = $10
   * [x] change amount state to private
   * [x] What to do with Dollar's side effect?
   * [ ] What to do with Money's rounding?
   * [x] equals()
   * [ ] hashCode()
   * [ ] Equivalence comparison with null
   * [ ] Equivalence comparison with another objects
   * [x] 5CHF * 2 = 10CHF
   * [ ] Duplicate Dollar and Franc
   * [x] Generalization of equals
   * [ ] Generarization of times
   * [x] Compare Dollar and Franc
   * [ ] Concept of Money
   */
  info("Multilateral currency")

  Feature("Currency rate conversion by Dollar side") {
    Scenario("User conversion Dollar to Franc") {
      /** There're four compile errors
       * [x] No Dollar class
       * [x] No Constructor
       * [x] No times method
       * [x] No amount field
       */
      Given("Dollar is given 5 dollar")
      val five: Dollar = new Dollar(5)

      When("conversion Double rate")
      Then("amount equals 10")
      assert(new Dollar(10).equals(five.times(2)))
    }

    Scenario("confirm other number to Dollar's amount field") {

      Given("Dollar is given 5 dollar")
      val five: Dollar = new Dollar(5)

      When("conversion triple rate")
      Then("amount equals 10")
      assert(new Dollar(15).equals(five.times(3)))
    }
  }

  Feature("Equivalence comparison") {
    Scenario("Confirm that Dollar instances are equivalence") {
      assert(new Dollar(5).equals(new Dollar(5)) === true)
    }

    Scenario("Confirm that Dollar instances are not equivalence") {
      assert(new Dollar(5).equals(new Dollar(6)) === false)
    }

    Scenario("Confirm that Franc instances are equivalence") {
      assert(new Franc(5).equals(new Franc(5)) === true)
    }

    Scenario("Confirm that Franc instances are not equivalence") {
      assert(new Franc(5).equals(new Franc(6)) === false)
    }

    Scenario("Confirm that Franc instance and Dollar is not equivalence") {
      assert(new Franc(5).equals(new Dollar(5)) === false)
    }
  }

  Feature("Currency rate conversion by Franc side") {
    Scenario("User conversion Franc to Dollar") {
      /** There're four compile errors
       * [x] No Franc class
       * [x] No Constructor
       * [x] No times method
       * [x] No amount field
       */
      Given("Franc is given 5 franc")
      val five: Franc = new Franc(5)

      When("conversion Double rate")
      Then("amount equals 10")
      assert(new Franc(10).equals(five.times(2)))
    }

    Scenario("confirm other number to Franc's amount field") {

      Given("Franc is given 5 dollar")
      val five: Franc = new Franc(5)

      When("conversion triple rate")
      Then("amount equals 10")
      assert(new Franc(15).equals(five.times(3)))
    }
  }
  /** Summary
   *
   * Expressed the problems in my head.
   * Pass the tests so-so, not perfectly.
   * Further design Putted it off until when I really need it.
   */
}
