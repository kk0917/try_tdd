package learn.tdd.money

trait Expression {
  def reduce(bank: Bank, to: String): Money
}
