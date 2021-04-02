package learn.tdd.money

class Franc(
  override var amount: Int
) extends Money {
  def times(multiplier: Int): Franc = new Franc(amount * multiplier)
}
