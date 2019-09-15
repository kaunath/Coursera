def msort[T](xs: List[T])(implicit ord:Ordering[T]): List[T] = {
  val n: Int = xs.length / 2
  if (n == 0) xs
  else {
    def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (ord.lt(x, y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)


    }

    val (fst, snd) = xs.splitAt(n)
    merge(msort(fst), msort(snd))
  }
}

val list = List(1, -9, 4, 3, 2)
msort(list)

val fruit = List("banana", "grape", "apple")
msort(fruit)

//compareTo() is a method that returns -1 if first
//sttring<2nd string returns 0 if 1st string==2nd string and returns 1 if
//1st string>2nd String