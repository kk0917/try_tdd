package learn.tdd.money

class Dollar(
  val amount: Int
) {
  def times(multipliet: Int): Int= {
    amount * multipliet
  }
}
