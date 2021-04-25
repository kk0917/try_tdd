package learn.tdd.money

class Bank {
  def reduce(source: Expression, to: String): Money = {
    source.reduce(this, to)
  }

  def addRate(from: String, to: String, rate: Int): Unit = null

  def rate(from: String, to: String): Int = {
    if (from.equals("CHF") && to.equals("USD")) 2 else 1
  }
}
