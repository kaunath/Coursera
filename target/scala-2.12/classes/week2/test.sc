def sum(f:Int=>Int)={
  def sumF(a:Int,b:Int):Int={
    if (a>b) 0
    else f(a)+sumF(a+1,b)

  }
  sumF(2,5)
}

sum((x:Int)=>x*x)