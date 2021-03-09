package learn.tdd.money

abstract class Money(
  protected val amount: Int
) {
  def isEquiv(obj: Money): Boolean = {
    val money = obj
    amount == money.amount && getClass.equals(money.getClass)
  }

  def dollar(amount: Int): Dollar = {
    return new Dollar(amount)
  }
}
