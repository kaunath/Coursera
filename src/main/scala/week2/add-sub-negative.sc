class Rational(x: Int, y: Int) {
  def numer = x

  def denom = y

  def add(that: Rational): Float = {
    (this.numer * that.denom + this.denom * that.numer) / (this.denom * that.denom)


  }

  override def toString: String = numer + "/" + denom
}

val normalobj1 = new Rational(2, 5)
val normalobj2 = new Rational(18, 6)

val normalobj3 = normalobj1.add(normalobj2)

/*or we can write by some another stylish method by
defining an object inside add method

all the methods of this program is very very important

 */
class Rational1(x: Int, y: Int) {
  def numer = x

  def denom = y

  def add(that: Rational1): Rational1 = {
    new Rational1(numer * that.denom + that.numer * denom, denom * that.denom)

  }

  //subtraction() subtracts two rationals
  def subtraction(that: Rational1) = {
    add(that.neg()) //this line is very very important
  }

  //neg() negates a rational

  def neg(): Rational1 = {
    new Rational1(-numer, denom)

  }

  override def toString: String = { //toString() is explictly called
    //like apply()
    numer + "/" + denom
  }
}

val stylishobj1 = new Rational1(2, 5)
val stylishobj2 = new Rational1(18, 6)

val stylishobj3: Rational1 = stylishobj1.add(stylishobj2)

stylishobj3.neg()
stylishobj1.subtraction(stylishobj2)
