package learn.tdd.money

class Franc(override val amount: Int) extends Money(amount){
  override def times(multiplier: Int): Money = {
    new Franc(amount * multiplier)
  }
}
