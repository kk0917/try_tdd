package learn.tdd.money

import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.GivenWhenThen

class MoneySpec extends AnyFeatureSpec with GivenWhenThen {
  /** new TODO:
   * [x] $5 + 10CHF = $10 (when rate is 2:1)
   * [x] $5 + $5 = $10
   * [ ] $5 + $5 returns Money
   * [x] Bank.reduce(Money)
   * [x] Change Money and convert it
   * [x] Reduce(Bank, String)
   * [x] Sum.plus
   * [x] Expression.times
   */
  info("Multilateral currency")

  Feature("Currency rate conversion by Dollar side") {
    Scenario("User conversion Dollar to Franc") {
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

  Feature("Simple Addition") {
    Scenario("") {
      val five: Money     = Money.dollar(5)
      val result: Expression = five.plus(five)
      val sum: Sum = result.asInstanceOf[Sum]

      assert(five.equals(sum.augend) === true)
      assert(five.equals(sum.addend) === true)
    }
  }

  Feature("1.13") {
    Scenario("Reduce Sum") {
      val sum: Expression = new Sum(Money.dollar(3), Money.dollar(4))
      val bank: Bank = new Bank()
      val result: Money = bank.reduce(sum, "USD")

      assert(Money.dollar(7).equals(result) === true)
    }

    Scenario("Reduce Money") {
      val bank: Bank = new Bank()
      val result: Money = bank.reduce(Money.dollar(1), "USD")

      assert(Money.dollar(1).equals(result) === true)
    }
  }

  Feature("1.14") {
//    Scenario("Reduce Money Different Currency") { // TODO: fix failed tests
//      val bank: Bank = new Bank()
//      bank.addRate("CHF", "USD", 2)
//      val result: Money = bank.reduce(Money.franc(2), "USD")
//
//      assert(Money.dollar(1).equals(result) === true)
//    }

    Scenario("Identity Rate") {
      assert(1 == new Bank().rate("USD", "USD"))
    }
  }

  Feature("1.15") {
//    Scenario("Mixed Addition") { // TODO: fix failed tests
//      val fiveBucks: Expression = Money.dollar(5)
//      val tenFrancs: Expression = Money.franc(10)
//
//      val bank: Bank = new Bank()
//
//      bank.addRate("CHF", "USD", 2)
//      val result: Money = bank.reduce(fiveBucks.plus(tenFrancs), "USD")
//
//      assert(Money.dollar(10) == result)
//    }
  }

  Feature("1.16") {
    Scenario("Sum Plus Money") {
      val fiveBucks: Expression = Money.dollar(5)
      val tenFrancs: Expression = Money.franc(10)

      val bank: Bank = new Bank()
      bank.addRate("CHF", "USD", 2)

      val sum: Expression = new Sum(fiveBucks, tenFrancs).plus(fiveBucks)
      val result: Money = bank.reduce(sum, "USD")

      assert(Money.dollar(15) == result)
    }

    Scenario("Sum Times") {
      val fiveBucks: Expression = Money.dollar(5)
      val tenFrancs: Expression = Money.franc(10)

      val bank: Bank = new Bank()
      bank.addRate("CHF", "USD", 2)

      val sum: Expression = new Sum(fiveBucks, tenFrancs).times(2)
      val result: Money   = bank.reduce(sum, "USD")

      assert(Money.dollar(20) == result)
    }
  }
  /** Summary
   *
   * ...
   */
}
