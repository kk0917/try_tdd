package learn.tdd.money

class Franc(override val amount: Int) extends Money(amount){
  def times(multiplier: Int): Money = {
    new Franc(amount * multiplier)
  }
}
