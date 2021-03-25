package learn.tdd.money

class Dollar(
  var amount: Int
) {
  def times(multiplier: Int): Dollar = new Dollar(amount * multiplier)

  def equals(obj: Dollar): Boolean = {
    val dollar = obj
    amount == dollar.amount
  }
}
