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

object List1{
  def apply[T](x:T,y:T): List[T] = new Cons[T](x,new Cons[T](y,new Nil))
  def apply[T](x:T): List[T] = new Cons[T](x,new Nil[T])
  def apply[T](): List[T] = new Nil[T]
}

List1(1,2)
List1(3)
List1()