package learn.tdd.money

class Franc(
  override val amount: Int,
  override val currencyType: String = "CHF"
) extends Money(
  amount,
  currencyType
) {
}
