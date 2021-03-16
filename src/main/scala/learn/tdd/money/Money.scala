package learn.tdd.money

abstract class Money(
  protected val amount: Int,
  protected val currencyName: String
) {
  def times(multiplier: Int): Money

  def currency(): String = currencyName

  def isEquiv(obj: Money): Boolean = {
    val money = obj
    amount == money.amount && getClass.equals(money.getClass)
  }
}

object Money {
  def dollar(amount: Int): Dollar = new Dollar(amount, "USD")

  def franc(amount: Int): Franc = new Franc(amount, "CHF")
}
