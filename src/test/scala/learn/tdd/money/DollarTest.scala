package learn.tdd.money

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.concurrent.TimeLimits.failAfter
import org.scalatest.time.SpanSugar._
import org.mockito.Mockito.{mock, when}

class DollarTest extends AnyFlatSpec {
  val five = new Dollar(5)

  "Dollar.sum function" should "fetch integers array, and can return sum them all." in {
    assert(five.times(2) === 10)
  }
}
