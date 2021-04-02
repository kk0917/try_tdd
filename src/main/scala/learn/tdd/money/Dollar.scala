package learn.tdd.money

class Dollar(
  override var amount: Int
) extends Money {
  def times(multiplier: Int): Dollar = new Dollar(amount * multiplier)
}
