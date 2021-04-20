package learn.tdd.money

class Bank {
  def reduce(source: Expression, to: String): Money = {
    source match {
      case money: Money =>
        money
      case _ =>
        val sum: Sum = source.asInstanceOf[Sum]
        sum.reduce(to)
    }
  }
}
