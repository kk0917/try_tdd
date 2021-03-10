package learn.tdd.money

class Dollar(override val amount: Int) extends Money(amount) {
  override def times(multiplier: Int): Money = {
    new Dollar(amount * multiplier)
  }
}
