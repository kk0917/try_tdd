package learn.tdd.money

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.GivenWhenThen

class MoneySpec extends AnyFeatureSpec with GivenWhenThen {
  /** TODO:
   * [ ] $5 + 10CHF = $10 (when rate is 2:1 between $ and CHF)
   * [x] $5 * 2 = $10
   * [x] change amount state to private?
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
      assert(new Dollar(10).equals(five.times(2)))
    }

    Scenario("confirm other number to Dollar's amount field") {

      Given("Dollar is given 5 dollar")
      val five: Dollar = new Dollar(5)

      When("conversion triple rate")
      val product: Dollar = five.times(3)

      Then("amount equals 10")
      assert(new Dollar(15).equals(five.times(3)))
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
   * Improved the tests by using the just created feature.
   * Noticed already throw my hands up now
   *   if there're 2 tests that not verified properly in the frist place.
   * Accepted their above risks and move forward.
   * Degrees the coupling of The tests code and the product by using a new feature of the test target ojects.
   */
}
