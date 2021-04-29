package learn.tdd.money

import scala.collection.mutable.{Map, HashMap}

class Bank {
  private val rates: Map[Pair, Int] = new HashMap[Pair, Int]()

  def reduce(source: Expression, to: String): Money = {
    source.reduce(this, to)
  }

  def addRate(from: String, to: String, rate: Int): Unit = rates.put(new Pair(from, to), rate)

  def rate(from: String, to: String): Option[Int] = rates.get(new Pair(from, to))
}
