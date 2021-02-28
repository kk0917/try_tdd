package learn.tdd.money

class Dollar(
  val amount: Int
) {
  def times(num: Int): Int= {
    val sum = amount * 2
    sum
  }
}
