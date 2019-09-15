trait List[T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty: Boolean = false
}

class Nil[T] extends List[T] {
  override def isEmpty: Boolean = true

  override def head: T = throw new NoSuchElementException("Nil.head")

  override def tail: List[T] = throw new NoSuchElementException("Nil.tail")

}

new Cons[Int](1, new Nil[Int])

new Nil[Int]

def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])

singleton[Int](2)
singleton[Boolean](true)
singleton[String]("hello")
singleton(Nil)
