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


def nth[T](x:Int, xs:List[T]):T={
  if(xs.isEmpty) throw new IndexOutOfBoundsException
  else
  if (x==0) xs.head
  else nth(x-1,xs.tail)
}

val list=new Cons[Int](1,new Cons[Int](2,new Cons[Int](3,new Nil)))
nth(2,list)
nth(5,list)