package learn.tdd.money

class Franc(
  amount: Int,
  currencyName: String
) extends Money(amount, currencyName) {

  def times(multiplier: Int): Money =
    Money.franc(amount * multiplier)
}
