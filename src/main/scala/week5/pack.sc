def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 => {
    val (first, second) = xs span (y => y == x)
    first :: pack(second)
  }
}

pack(List('a','a','a','b','c','d','c','c'))