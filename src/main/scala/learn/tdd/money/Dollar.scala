package learn.tdd.money

class Dollar(override val amount: Int) extends Money(amount) {

  def times(multiplier: Int): Money = new Dollar(amount * multiplier)
}
