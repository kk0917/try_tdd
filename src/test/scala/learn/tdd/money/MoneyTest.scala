package learn.tdd.money

import org.scalatest.flatspec.AnyFlatSpec

/** TODO: list
 *  [ ] $5 +10 CHF = $10 (When the rate is 2: 1)s
 *  [x] $5 * 2 = $10
 *  [x] Change amount states to private
 *  [x] What to do with Dollar's side effects?
 *  [ ] What to do Money's rounding?
 *  [x] equals()
 *  [ ] hashCode()
 *  [ ] Equivalence comparison with null
 *  [ ] Equivalence comparison with other objects
 *  [x] 5CHF * 2 = 10 CHF
 *  [ ] Duplicate Dollar and Franc
 *  [x] Generalization of equals
 *  [ ] Generalization of times
 *  [x] Compare Franc and Dollar
 *  [x] Concept of Money
 *  [ ] Remove testFrancMultiplication?
 */

class MoneyTest extends AnyFlatSpec {

  /** There are 4 errors of compile..
   *  [x] No Dollar class.
   *  [x] No Constructor.
   *  [x] No times Method.
   *  [x] No amount Field.
   */
  val five: Money = Money.dollar(5)

  "Dollar.times function" should "multiple * amount = expected value 10" in {
    assert(Money.dollar(10).isEquiv(five.times(2)))
  }
  "Dollar.times function" should "multiple * amount = expected value 15" in {
    assert(Money.dollar(15).isEquiv(five.times(3)))
  }

  /** Equivalence comparing
   */
  "5 dollars" should "equivalent another 5 dollars instance" in {
    assert(Money.dollar(5).isEquiv(Money.dollar(5)))
  }
  "5 dollars" should "not equivalent another value dollar instance" in {
    assert(Money.dollar(5).isEquiv(Money.dollar(6)) === false)
  }
  "5 cinq" should "equivalent another 5 cinq instance" in {
    assert(Money.franc(5).isEquiv(Money.franc(5)))
  }
  "5 cinq" should "not equivalent another value cinq instance" in {
    assert(Money.franc(5).isEquiv(Money.franc(6)) === false)
  }
  "franc" should "not equals dollars" in {
    assert(Money.franc(5).isEquiv(Money.dollar(5)) === false)
  }

  /** There are 4 errors of compile..
   *  [x] No Franc class.
   *  [x] No Constructor.
   *  [x] No times Method.
   *  [x] No amount Field.
   */
  val cinq: Money = Money.franc(5) // five is cinq in French

  "Franc.times function" should "multiple * amount = expected value 10" in {
    assert(Money.franc(10).isEquiv(cinq.times(2)))
  }
  "Franc.times function" should "multiple * amount = expected value 15" in {
    assert(Money.franc(15).isEquiv(cinq.times(3)))
  }

  /** There are 1 errors of compile..
   *  [x] No currency Method.
   */
  "Money.currency function" should "currency" in {
    assert("USD" === Money.dollar(1).currency())
    assert("CHF" === Money.franc(1).currency())
  }

  /** 1.9 Summery
   *  I almost got absorbed in a big design change, so ...
   */
}
