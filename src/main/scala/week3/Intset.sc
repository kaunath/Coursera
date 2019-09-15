abstract class Intset {
  def incl(x: Int): Intset

  def contains(x: Int): Boolean
}


class Empty extends Intset {
  def incl(x: Int): Intset = new NonEmpty(x, new Empty, new Empty)

  override def contains(x: Int): Boolean = false

  override def toString: String = "."
}

class NonEmpty(elem: Int, left: Intset, right: Intset) extends Intset {
  override def contains(x: Int): Boolean = {
    if (x < elem) left contains x
    if (x > elem) right contains x
    else true
  }

  override def incl(x: Int): Intset = {
    if (x < elem) new NonEmpty(elem, left incl (x), right)
    else if (x > elem) new NonEmpty(elem, left, right incl (x))
    else this
  }

  override def toString: String = "{" + left + elem + right + "}"
}

val obj1 = new NonEmpty(3, new Empty, new Empty)
val obj2 = obj1 incl 4
