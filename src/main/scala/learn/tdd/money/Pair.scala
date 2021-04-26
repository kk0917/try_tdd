package learn.tdd.money

class Pair(
  private val from: String,
  private val to: String
) {
  def equals(obj: Object): Boolean = {
    val pair: Pair = obj.asInstanceOf[Pair]
    from.equals(pair.from) && to.equals(pair.to)
  }

  override def hashCode(): Int = 0
}
