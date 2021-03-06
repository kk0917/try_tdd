package learn.tdd.money

class Franc(override val amount: Int) extends Money(amount){
  def times(multiplier: Int): Franc = {
    new Franc(amount * multiplier)
  }
}
