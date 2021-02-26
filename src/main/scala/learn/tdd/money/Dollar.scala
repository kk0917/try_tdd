package learn.tdd.money

class Dollar(var sum: Int) {
  def times(num: Int): Unit= {
    sum = num * 2
  }

  def amount: Int = {
    sum
  }
}
