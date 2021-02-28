package learn.tdd.money

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.concurrent.TimeLimits.failAfter
import org.scalatest.time.SpanSugar._
import org.mockito.Mockito.{mock, when}

/** TODO: list
 *  $5 +10 CHF = $10 (When the rate is 2: 1)s
 *  [x] $5 * 2 = $10
 *  Change amount states to private
 *  What to do with Dollar's side effects?
 *  What to do Money's rounding?
 */

class DollarTest extends AnyFlatSpec {

  /** There are 4 errors of compile..
   *  Done: No Dollar class.
   *  Done: No Constructor.
   *  Done: No times Method.
   *  Done: No amount Field.
   */
  val five = new Dollar(5)

  "Dollar.sum function" should "multiple * amount = expected value" in {
    assert(five.times(2) === 10)
  }
}
