package learn.tdd.money

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.GivenWhenThen

class MoneySpec extends AnyFeatureSpec with GivenWhenThen {
  /** TODO:
   * [ ] $5 + 10CHF = $10 (when rate is 2:1 between $ and CHF)
   * [ ] $5 * 2 = $10
   * [ ] change amount state to private?
   * [ ] What to do with Dollar's side effect?
   * [ ] What to do with Money's rounding?
   */
  info("Multilateral currency")

  Feature("Currency rate conversion") {
    Scenario("User conversion Dollar to Franc") {
      /** There're four compile errors
       * No Dollar class
       * - No Constructor
       *   No times method
       *   No amount field
       */
      Given("Dollar is given 5 dollar")
      val five: Dollar = new Dollar(5)

      When("conversion Double rate")
      five.times(2)

      Then("amount equals 10")
      assert(10 === five.amount)
    }
  }
}
