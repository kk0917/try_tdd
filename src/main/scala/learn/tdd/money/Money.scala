package learn.tdd.money

abstract class Money(
  protected val amount: Int
) {

  def times(multiplier: Int): Money

  def isEquiv(obj: Money): Boolean = {
    val money = obj
    amount == money.amount && getClass.equals(money.getClass)
  }
}

object Money {
  def dollar(amount: Int): Dollar = new Dollar(amount)

  def franc(amount: Int): Franc = new Franc(amount)
}
