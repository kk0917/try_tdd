package learn.tdd.money

trait Expression {
  def reduce(to: String): Money
}
