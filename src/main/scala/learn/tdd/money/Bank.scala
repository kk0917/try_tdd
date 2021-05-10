package learn.tdd.money

import java.util

class Bank {
  private val rates: util.Map[Pair, Int] = new util.HashMap[Pair, Int]()

  def reduce(source: Expression, to: String): Money =
    source.reduce(this, to)

  def addRate(from: String, to: String, rate: Int): Unit =
    rates.put(new Pair(from, to), rate)

  def rate(from: String, to: String): Int =
    if (from.equals(to)) 1 else rates.get(new Pair(from, to))
}
