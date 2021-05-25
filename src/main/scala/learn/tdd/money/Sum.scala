package learn.tdd.money

class Sum(
  val augend: Expression,
  val addend: Expression
) extends Expression {
  def plus(addend: Expression): Expression = new Sum(this, addend)

  def reduce(bank: Bank, to: String): Money = {
    val amount: Int = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
    new Money(amount, to)
  }
}
