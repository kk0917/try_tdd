package learn.tdd.money

class Dollar(
  override val amount: Int,
  override val currencyName: String
) extends Money(amount, currencyName) {

  def times(multiplier: Int): Money =
    new Dollar(amount * multiplier, null)
}
