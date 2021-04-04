package learn.tdd.money

class Franc(
  override var amount: Int
) extends Money {
  def times(multiplier: Int): Money = new Franc(amount * multiplier)
}
