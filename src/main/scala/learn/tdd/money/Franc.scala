package learn.tdd.money

class Franc(
  private val amount: Int
) {
  def times(multiplier: Int): Franc = {
    new Franc(amount * multiplier)
  }

  def equals(obj: Franc): Boolean = {
    val franc = obj
    amount == franc.amount
  }
}
