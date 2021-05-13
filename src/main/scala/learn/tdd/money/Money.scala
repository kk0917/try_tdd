package learn.tdd.money

import scala.util.Try

class Money(
  val amount: Int, // TODO: add protected modifier, and resolved compile error into Sum.scala
  protected val currencyType: String
) extends Expression {

  def times(multiplier: Int): Money = new Money(amount * multiplier, currencyType)

  def plus(addend: Money): Expression = new Sum(Money.this, addend)

  def reduce(bank: Bank, to: String): Money = {
    val rate: Int = bank.rate(currencyType, to)

    new Money(Try(amount / rate).getOrElse(0), to)
  }

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
