abstract class Nat {
  def isZero: Boolean

  def predecessor: Nat

  def sucessor = new Succ(this)

  def +(that: Nat): Nat

  def -(that: Nat): Nat
}

object Zero extends Nat {
  override def isZero: Boolean = true

  override def predecessor: Nat = throw new Error("0.predecsseor")

  override def +(that: Nat): Nat = that

  override def -(that: Nat): Nat = if (that.isZero) that else throw new Error("negative number")

}

class Succ(nat: Nat) extends Nat {

  override def isZero: Boolean = false

  override def predecessor: Nat = nat

  override def +(that: Nat): Nat = nat + that

  override def -(that: Nat): Nat = if (that.isZero) this else nat - that.predecessor
}
val a=List(1,2)
a.filter()