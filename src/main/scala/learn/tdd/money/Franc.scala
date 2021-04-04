package learn.tdd.money

class Franc(
  val amount: Int,
  val currencyType: String = "CHF"
) extends Money {

  def times(multiplier: Int): Money = new Franc(amount * multiplier)
}
