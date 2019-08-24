class FunWithRational(x: Int, y: Int) {
  require(y!=0, "denominator must be non zero")
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  val g = gcd(x, y)

  def numer = x / g

  def denom = y / g

  def add(that: FunWithRational): FunWithRational = {
    new FunWithRational(numer * that.denom + that.numer * denom, denom * that.denom)

  }

  def less(that: FunWithRational) = this.numer * that.denom < this.denom * that.numer

  def max(that: FunWithRational) = if (this.less(that)) that else this

  override def toString: String = { //toString() is explictly called
    //like apply()
    numer + "/" + denom
  }
}

val a = new FunWithRational(2, 3)
val b = new FunWithRational(5, 0)
b.add(b)

a.less(b)
val c = a.max(b)
