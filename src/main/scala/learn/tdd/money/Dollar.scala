package learn.tdd.money

class Dollar(
  var amount: Int
) {
  def times(multiplier: Int): Int = {
    amount *= multiplier
    amount
  }
}
