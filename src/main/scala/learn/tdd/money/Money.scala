package learn.tdd.money

class Money (
  protected val amount: Int,
  protected val currencyType: String
) {

  def times(multiplier: Int): Money = new Money(amount * multiplier, currencyType)

  def currency(): String = currencyType

  def equals(obj: Money): Boolean = {
    val money: Money = obj
    amount == money.amount && currencyType.equals(money.currencyType)
  }
}

object Money {
  def dollar(amount: Int): Money = new Dollar(amount, "USD")

  def franc(amount: Int): Money = new Franc(amount, "CHF")
}
