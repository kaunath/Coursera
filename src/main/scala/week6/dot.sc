val vector1: Vector[Int] = Vector(1, 2, 3)
val vector2: Vector[Int] = Vector(4, 5, 6)
vector1.indexOf(vector1)
val zip1: Vector[(Int, Int)] = vector1 zip (vector2)
zip1 unzip

def scalerProduct(vector1: Vector[Int], vector2: Vector[Int]) = {
  (vector1 zip (vector2) map (x => x._1 * x._2)).sum
}

scalerProduct(vector1, vector2)

//check for prime
val n = 5
(2 until n) forall (d => n % d != 0)