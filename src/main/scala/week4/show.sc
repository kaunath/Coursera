trait Expr
case  class Number (n:Int) extends Expr
case class Sum(e1:Expr,e2:Expr) extends Expr

  def show(e:Expr) :String= e match {
    case  Number(n)=> n.toString
    case Sum(e1,e2)=> show(e1)  + show(e2)
  }

  show( Number(23))
  show(Sum(Number(23),Number(90)))
