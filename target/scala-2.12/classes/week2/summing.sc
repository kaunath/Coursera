def sumInts(a:Int,b:Int)= {
  def sum(f:Int=>Int,a:Int, b: Int): Int = {
    if (a > b) 0
    else f(a) + sum(id, a + 1, b)
  }

  def id(a: Int): Int = a

  sum(id,a,b)
}
sumInts(3,11)
sumInts(11,10)

