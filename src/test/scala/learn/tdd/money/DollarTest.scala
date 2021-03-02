package learn.tdd.money

import org.scalatest.flatspec.AnyFlatSpec

/** TODO: list
 * [ ] $5 +10 CHF = $10 (When the rate is 2: 1)s
 * [x] $5 * 2 = $10
 * [ ] Change amount states to private
 * [x] What to do with Dollar's side effects?
 * [ ] What to do Money's rounding?
 * [x] equals()
 * [ ] hashCode()
 * [ ] Equivalence comparison with null
 * [ ] Equivalence comparison with other objects
 */

class DollarTest extends AnyFlatSpec {

  /** There are 4 errors of compile..
   * [x] No Dollar class.
   * [x] No Constructor.
   * [x] No times Method.
   * [x] No amount Field.
   */
  val five = new Dollar(5)

  "Dollar.sum function" should "multiple * amount = expected value 10" in {
    val five = new Dollar(5)
    val product = five.times(2)
    assert(product.amount === 10)
  }

  "Dollar.sum function" should "multiple * amount = expected value 15" in {
    val five = new Dollar(5)
    val product = five.times(3)
    assert(product.amount === 15)
  }

  "5 dollars" should "equivalent another 5 dollars instance" in {
    assert(new Dollar(5).equals(new Dollar(5)))
  }

  "5 dollars" should "not equivalent another value dollar instance" in {
    assert(new Dollar(5).equals(new Dollar(6)) === false)
  }
}
