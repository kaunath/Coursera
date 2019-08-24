import scala.math.abs

val tolerance = 0.0001

def isCloseEnough(x: Double, y: Double): Boolean =
  abs((x - y) / x) / x < tolerance

def fixedPoint(f: Double => Double)(firstGuess: Double): Double = {

  def iterate(guess: Double): Double = {
    val next = f(guess)
    if (isCloseEnough(guess, next)) next
    else iterate(next)

  }

  iterate(firstGuess)
}

//def sqrt(x:Double)=fixedPoint((y:Double)=>x/y)(1.0) it will give error
def sqrt(x:Double)=fixedPoint((y:Double)=>(y+x/y)/2)(1.0)

sqrt(2)
sqrt(4)