package learn.tdd.money

abstract class Money(
  protected val amount: Int
) {
  def isEquiv(obj: Money): Boolean = {
    val money = obj
    amount == money.amount
  }
}
