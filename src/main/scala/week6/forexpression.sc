val vector1: Vector[Int] =Vector(1,2,3)
val vector2: Vector[Int] =Vector(4,5,6)

def scalerProduct(vector1: Vector[Int],vector2: Vector[Int])={
  (vector1 zip (vector2) map(x=>x._1*x._2)).sum
}

scalerProduct(vector1,vector2)

def scalerProductFor(vector1: Vector[Int],vector2: Vector[Int]) ={
  (for((x,y)<-vector1 zip(vector2))yield x*y).sum
}

scalerProductFor(vector1,vector2)
val list=List(1,6,7,0,5)
list.foldLeft(0)((x,y)=>y)

//List(1,24,5):::List("hello","world")