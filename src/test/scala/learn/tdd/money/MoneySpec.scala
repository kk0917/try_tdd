package learn.tdd.money

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.GivenWhenThen

class MoneySpec extends AnyFeatureSpec with GivenWhenThen {
  /** New TODO:
   * [ ] $5 + 10CHF = $10 (when rate is 2:1 between $ and CHF)
   * [ ] $5 + $5 = $10
   * [ ] $5 + $5 returns Money
   */
  /** TODO:
   * [x] $5 * 2 = $10
   * [x] change amount state to private
   * [x] What to do with Dollar's side effect?
   * [ ] What to do with Money's rounding?
   * [x] equals()
   * [ ] hashCode()
   * [ ] Equivalence comparison with null
   * [ ] Equivalence comparison with another objects
   * [x] 5CHF * 2 = 10CHF
   * [x] Duplicate Dollar and Franc
   * [x] Generalization of equals
   * [x] Generarization of times
   * [x] Compare Dollar and Franc
   * [x] Concept of Money
   * [x] Delete Franc's test cases?
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
      val five: Money = Money.dollar(5)

      When("conversion Double rate")
      Then("amount equals 10")
      assert(Money.dollar(10).equals(five.times(2)))
    }

    Scenario("confirm other number to Dollar's amount field") {

      Given("Dollar is given 5 dollar")
      val five: Money = Money.dollar(5)

      When("conversion triple rate")
      Then("amount equals 10")
      assert(Money.dollar(15).equals(five.times(3)))
    }
  }

  Feature("Equivalence comparison") {
    Scenario("Confirm that Dollar instances are equivalence") {
      assert(Money.dollar(5).equals(Money.dollar(5)) === true)
    }

    Scenario("Confirm that Dollar instances are not equivalence") {
      assert(Money.dollar(5).equals(Money.dollar(6)) === false)
    }

    Scenario("Confirm that Franc instance and Dollar is not equivalence") {
      assert(Money.franc(5).equals(Money.dollar(5)) === false)
    }
  }

  Feature("Confirm either currency type matched or not") {
    Scenario("match currency type of Dollar") {
      Given("")
      When("")
      Then("currency Dollar's type match")
      assert("USD" === Money.dollar(1).currency())
    }

    Scenario("match currency type of Franc") {
      Given("")
      When("")
      Then("currency Franc's type match")
      assert("CHF" === Money.franc(1).currency())
    }
  }

  Feature("test simple addition") {
    Scenario("case1") {
      val five: Money     = Money.dollar(5)
      val sum: Expression = five.plus(five)
      val bank: Bank      = new Bank()
      val reduced: Money  = bank.reduce(sum, "USD")

      assert(Money.dollar(10).equals(reduced))
    }

    Scenario("case2") {
      val five: Money = Money.dollar(5)
      val result: Expression = five.plus(five)
      val sum: Sum = result.asInstanceOf[Sum]

      assert(five == sum.augend)
      assert(five == sum.addend)
    }
  }

  Feature("Reduce sum") {
    Scenario("case1") {
      val sum: Expression = new Sum(Money.dollar(3), Money.dollar(4))
      val bank: Bank      = new Bank()
      val result: Money   = bank.reduce(sum, "USD")

      assert(Money.dollar(7) ==  result)
    }
  }
  /** Summary
   *
   * Separated the big tests and make the small tests that can see the progress.
   * Thought deeply about the metaphor for calculating from now.
   * Rewritten the previous tests by using the new metaphor.
   * Progressed quickly until can be compiled.
   * Have enjoyed the refactoring for directing to real implement,
   *    feel nervous a little
   */
}
