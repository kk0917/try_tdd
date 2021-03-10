package learn.tdd.money

class Money(
  protected val amount: Int
) {

  def times(multiplier: Int): Money =
    new Money(amount)

  def isEquiv(obj: Money): Boolean = {
    val money = obj
    amount == money.amount && getClass.equals(money.getClass)
  }

  def dollar(amount: Int): Dollar =
    return new Dollar(amount)

  def franc(amount: Int): Franc =
    return new Franc(amount)
}
