def pack[T](xs: List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 => {
    val (first, second) = xs span (y => y == x)
    first :: pack(second)
  }
}

def encode[T](list: List[T]):List[(T,Int)]= {

  pack(list).map(y=>(y.head,y.length))



}
pack(List('a','a','a','b','c','c','d','a'))
encode(List('a','a','a','b','c','c','d','a'))
List(1,2)reduceLeft()