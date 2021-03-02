package learn.tdd.money

class Dollar(
  val amount: Int
) {
  def times(multipliet: Int): Int= {
    amount * multipliet
  }

  def equals(obj: Dollar): Boolean = {
    val dollar = obj
    amount == dollar.amount
  }
}
