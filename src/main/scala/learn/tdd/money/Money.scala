package learn.tdd.money

import scala.util.Try

/** Manage currency
 *
 * @constructor create a new maney with a amount and currency type.
 * @param amount       the money's amount
 * @param currencyType ex. Dollar is "USD", Franc is "CHF"
 */
class Money(
  val amount: Int, // TODO: add protected modifier, and resolved compile error into Sum.scala
  protected val currencyType: String
) extends Expression {
  /** Get Money's amount multiplied currently rate
   *
   * @param multiplier Money's rate
   * @return a new Money's instance with amount multiplied currently rate
   */
  def times(multiplier: Int): Expression = new Money(amount * multiplier, currencyType)

  /** 
   *
   * @param addend
   * @return
   */
  def plus(addend: Expression): Expression = new Sum(Money.this, addend)

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
