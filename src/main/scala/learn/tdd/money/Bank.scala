package learn.tdd.money

class Bank {
  def reduce(source: Expression, to: String): Money = {
    source match {
      case source: Money => source.asInstanceOf[Money].reduce(to)
      case _ =>
        val sum = source.asInstanceOf[Sum]
        sum.reduce(to)
    }
  }
}
