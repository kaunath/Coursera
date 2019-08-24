class Rational(val x: Int, val y: Int) {
  def numer = x

  def denom = y

}

def addRational(r: Rational, s: Rational) = {
  new Rational(r.numer * s.denom + r.denom * s.numer,
    r.denom * s.denom)
}

def mkString(r: Rational): String = {
  r.numer + "/" + r.denom
}

val a = new Rational(2, 3)
val b = new Rational(5, 6)

println(addRational(a, b))

println(mkString(a))

mkString(addRational(new Rational(2,3),new Rational(5,6)))