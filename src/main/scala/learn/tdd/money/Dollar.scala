package learn.tdd.money

class Dollar(
  override val amount: Int,
  override val currencyType: String = "USD"
) extends Money(
  amount,
  currencyType
) {
}
