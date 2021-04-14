package learn.tdd.money

class Bank {
  def reduce(source: Expression, to: String): Money = {
    val sum: Sum = source.asInstanceOf[Sum]
    val amount: Int = sum.augend.amount + sum.addend.amount
    amount
  }
  /** Noticed stingking quickly about the following two points
   * 1. Casted. Actually It must operate whatever Expressiong type is
   * 2. Accessed to Sum's field. Moreover, accessed the field of it.
   */
}