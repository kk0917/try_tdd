package learn.tdd.money

class Dollar(
  override var amount: Int
) extends Money {
  def times(multiplier: Int): Money = new Dollar(amount * multiplier)
}
