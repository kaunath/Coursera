val capitalCountry=Map("us"->"washington", "india"-> "new delhi")
val a =Tuple1(1,2,3)
val b=Tuple2(0,2)
val c=Tuple3(2,3,4)
a._1
b._2
b._1
c._1
c._2
c._3



capitalCountry map {
  case (x,y)=>(y,x)
}

capitalCountry("us")

//capitalCountry("uk")
Option("a").getOrElse("f")
capitalCountry get ("uk ")

def showCapital(capital:String): String = {
  capitalCountry get (capital) match {
    case Some(capital) => capital
    case None => "Missing"
  }
}
  showCapital("China")
showCapital("us")


