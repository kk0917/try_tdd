package learn.tdd.money

class Franc(
  override val amount: Int,
  override val currencyName: String
) extends Money(amount, currencyName) {

  def times(multiplier: Int): Money =
    new Franc(amount * multiplier)
}
