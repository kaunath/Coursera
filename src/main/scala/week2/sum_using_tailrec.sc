def sum(a:Int,b:Int)={
  def sumInt(a:Int,acc:Int):Int={
    if(a>b) acc
    else
      sumInt(a+1,acc+(a*a))
  }
  sumInt(a,0)
}

sum(2,5)

//this code can also be written as
def sum2(f:Int=>Int,a:Int,b:Int)={
  def sumInt(a:Int,acc:Int):Int={
    if(a>b) acc
    else
      sumInt(a+1,acc+f(a))
  }
  sumInt(a,0)
}

sum2((x:Int)=>x*x,2,5)



