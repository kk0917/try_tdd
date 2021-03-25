package learn.tdd.money

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.GivenWhenThen

class MoneySpec extends AnyFeatureSpec with GivenWhenThen {
  /** TODO:
   * [ ] $5 + 10CHF = $10 (when rate is 2:1 between $ and CHF)
   * [x] $5 * 2 = $10
   * [ ] change amount state to private?
   * [x] What to do with Dollar's side effect?
   * [ ] What to do with Money's rounding?
   * [x] equals()
   * [ ] hashCode()
   * [ ] Equivalence comparison with null
   * [ ] Equivalence comparison with another objects
   */
  info("Multilateral currency")

  Feature("Currency rate conversion") {
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
      val product: Dollar = five.times(2)

      Then("amount equals 10")
      assert(10 === product.amount)
    }

    Scenario("confirm other number to Dollar's amount field") {

      Given("Dollar is given 5 dollar")
      val five: Dollar = new Dollar(5)

      When("conversion triple rate")
      val product: Dollar = five.times(3)

      Then("amount equals 10")
      assert(15 === product.amount)
    }
  }

  Feature("Triangulation") {
    Scenario("Confirm instances are equivalence") {
      Given("Give 5 dollars to the Dollar argument")
      When("when generate Dollar instance")
      Then("These instance are equivalence")
      assert(new Dollar(5).equals(new Dollar(5)) === true)
    }

    Scenario("Confirm instances are not equivalence") {
      Given("Give 5 dollars to the Dollar argument")
      When("when generate Dollar instance")
      Then("These instance are not equivalence")
      assert(new Dollar(5).equals(new Dollar(6)) === false)
    }
  }
  /** Summary
   *
   * Understood the condition that satisfy 'Value Object' pattern.
   * Wrote codes that satisfy that condition.
   * Implemented simply
   * Wrote more one test instead of Refactored quickly
   * Refactored passing the two scenarios at the same time.
   */
}
