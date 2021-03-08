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
 * [x] 5CHF * 2 = 10 CHF
 * [ ] Duplicate Dollar and Franc
 * [x] Generalization of equals
 * [ ] Generalization of times
 * [x] Compare Franc and Dollar
 * [ ] Concept of Money
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
    assert(new Dollar(10).isEquiv(five.times(2)))
  }
  "Dollar.times function" should "multiple * amount = expected value 15" in {
    assert(new Dollar(15).isEquiv(five.times(3)))
  }

  /** Equivalence comparing
   *
   */
  "5 dollars" should "equivalent another 5 dollars instance" in {
    assert(new Dollar(5).isEquiv(new Dollar(5)))
  }
  "5 dollars" should "not equivalent another value dollar instance" in {
    assert(new Dollar(5).isEquiv(new Dollar(6)) === false)
  }
  "5 cinq" should "equivalent another 5 cinq instance" in {
    assert(new Franc(5).isEquiv(new Franc(5)))
  }
  "5 cinq" should "not equivalent another value cinq instance" in {
    assert(new Franc(5).isEquiv(new Franc(6)) === false)
  }
  "franc" should "not equals dollars" in {
    assert(new Franc(5).isEquiv(new Dollar(5)) === false)
  }

  /** There are 4 errors of compile..
   * [x] No Franc class.
   * [x] No Constructor.
   * [x] No times Method.
   * [x] No amount Field.
   */
  val cinq = new Franc(5) // five is cinq in French

  "Franc.times function" should "multiple * amount = expected value 10" in {
    assert(new Franc(10).isEquiv(cinq.times(2)))
  }
  "Franc.times function" should "multiple * amount = expected value 15" in {
    assert(new Franc(15).isEquiv(cinq.times(3)))
  }

  /** Summery
   * Expressed the doubt into my head as test
   * The test Passed. Not perfect, but It's OK
   * More design putted it off until really needs
   */
}
