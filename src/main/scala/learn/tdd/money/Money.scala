package learn.tdd.money

abstract class Money {
  protected var amount: Int

  def equals(obj: Money): Boolean = {
    val money: Money = obj
    amount == money.amount
  }
}
