val a=Set(1,3,4,2,1)
a & Set(1,3,5)
a &~ Set(1,3,5)
val b=List(1,3,4,2,1)
a.map (_/2)

b.map(_/2)
a.foreach(x=>println(x))

val list=List(1,23,4,5,6,7)
list.groupBy(x=>x+1)

val list1=List("apple","pineapple","pear")
list1.groupBy(_.head)