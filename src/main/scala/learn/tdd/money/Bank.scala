package learn.tdd.money

class Bank {
  def reduce(source: Expression, to: String): Money = {
    source.reduce(to)
  }

  def addRate(from: String, to: String, rate: Int): Unit
}
