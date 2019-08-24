import scala.math.abs

val tolerance = 0.001

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

fixedPoint((x: Double) => 1 + x / 2)(1)