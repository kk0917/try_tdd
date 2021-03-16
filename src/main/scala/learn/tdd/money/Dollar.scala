package learn.tdd.money

class Dollar(
  amount: Int,
  currencyName: String
) extends Money(amount, currencyName) {

  def times(multiplier: Int): Money =
    Money.dollar(amount * multiplier)
}
