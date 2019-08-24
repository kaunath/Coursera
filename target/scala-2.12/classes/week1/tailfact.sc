def fact(no: Int): BigInt = {
  def loop(acc: Int, no:Int): BigInt = {
    if (no == 0) acc
    else loop(no * acc, no - 1)

  }

  loop(1, no)
}

fact(5)
fact(20)
val a:BigInt=fact(50)