package learn.tdd.money

class Money(
  val amount: Int,
  protected val currencyType: String
) extends Expression {

  def times(multiplier: Int): Money = new Money(amount * multiplier, currencyType)

  def plus(addend: Money): Expression = new Sum(Money.this, addend)

  def reduce(to: String): Money = this

  def currency(): String = currencyType

  def equals(obj: Money): Boolean = {
    val money: Money = obj
    amount == money.amount && currencyType.equals(money.currencyType)
  }
}

object Money {
  def dollar(amount: Int): Money = new Money(amount, "USD")

  def franc(amount: Int): Money = new Money(amount, "CHF")
}
