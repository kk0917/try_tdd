package learn.tdd.money

class Dollar(
  val amount: Int,
  val currencyType: String = "USD"
) extends Money {

  def times(multiplier: Int): Money = Money.dollar(amount * multiplier)
}
