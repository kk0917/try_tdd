package learn.tdd.money

abstract class Money {
  protected var amount: Int
  def times(multiplier: Int): Money
  def currency(): String

  def equals(obj: Money): Boolean = {
    val money: Money = obj
    amount == money.amount && getClass.equals(money.getClass)
  }
}

object Money {
  def dollar(amount: Int): Money = new Dollar(amount)

  def franc(amount: Int): Money = new Franc(amount)
}
