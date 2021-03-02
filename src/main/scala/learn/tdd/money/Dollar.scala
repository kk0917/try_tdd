package learn.tdd.money

class Dollar(
  val amount: Int
) {
  def times(multipliet: Int): Dollar= {
    val dollar = new Dollar(amount * multipliet)
    dollar
  }

  def equals(obj: Dollar): Boolean = {
    val dollar = obj
    amount == dollar.amount
  }
}
