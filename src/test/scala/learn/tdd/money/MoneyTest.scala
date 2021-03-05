package learn.tdd.money

import org.scalatest.flatspec.AnyFlatSpec

/** TODO: list
 * [ ] $5 +10 CHF = $10 (When the rate is 2: 1)s
 * [x] $5 * 2 = $10
 * [x] Change amount states to private
 * [x] What to do with Dollar's side effects?
 * [ ] What to do Money's rounding?
 * [x] equals()
 * [ ] hashCode()
 * [ ] Equivalence comparison with null
 * [ ] Equivalence comparison with other objects
 */

class MoneyTest extends AnyFlatSpec {

  /** There are 4 errors of compile..
   * [x] No Dollar class.
   * [x] No Constructor.
   * [x] No times Method.
   * [x] No amount Field.
   */
  val five = new Dollar(5)

  "Dollar.times function" should "multiple * amount = expected value 10" in {
    assert(new Dollar(10).equals(five.times(2)))
  }

  "Dollar.times function" should "multiple * amount = expected value 15" in {
    assert(new Dollar(15).equals(five.times(3)))
  }

  "5 dollars" should "equivalent another 5 dollars instance" in {
    assert(new Dollar(5).equals(new Dollar(5)))
  }

  "5 dollars" should "not equivalent another value dollar instance" in {
    assert(new Dollar(5).equals(new Dollar(6)) === false)
  }

  /** There are 4 errors of compile..
   * [ ] No Franc class.
   * [ ] No Constructor.
   * [ ] No times Method.
   * [ ] No amount Field.
   */
  val cinq = new Franc(5) // five is cinq in French

  "Franc.times function" should "multiple * amount = expected value 10" in {
    assert(new Franc(10).equals(cinq.times(2)))
  }

  "Franc.times function" should "multiple * amount = expected value 15" in {
    assert(new Franc(15).equals(cinq.times(3)))
  }
}
