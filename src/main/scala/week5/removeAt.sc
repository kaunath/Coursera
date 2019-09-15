def removeAt[T](n: Int, xs: List[T]): List[T] = xs.take(n) ::: xs.drop(n+1)

List(1,24,5,6,4,8,9).drop(3)
List(1,24,5,6,4,8,9).take(3)


removeAt(4,List(1,24,5,6,4,8,9))

