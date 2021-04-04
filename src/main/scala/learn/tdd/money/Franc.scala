package learn.tdd.money

class Franc(
  override var amount: Int
) extends Money {
  val currencyType: String = "CHF"
  def currency(): String = currencyType
  def times(multiplier: Int): Money = new Franc(amount * multiplier)
}
