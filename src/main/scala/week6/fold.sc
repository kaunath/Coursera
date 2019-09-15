def concat(xs:List[Int],ys:List[Int]):List[Int]={
  (xs.foldRight(_::_))
}
concat(List(1,2),List(3,4))