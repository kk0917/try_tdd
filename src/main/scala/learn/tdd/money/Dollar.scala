package learn.tdd.money

class Dollar(
  override var amount: Int
) extends Money {
  val currencyType: String = "USD"
  def currency(): String = currencyType
  def times(multiplier: Int): Money = new Dollar(amount * multiplier)
}
