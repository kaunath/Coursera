val list = List(1, 2, 34, 4)
def squareList(list: List[Int]) = {
  list.map(x => x * x)
}

squareList(list)