val xs=Array(1,2,3,44)
xs.map(x=>x*2)

val string="HelloWorld"

string.filter(x=>x.isUpper)

string.exists(x=>x.isUpper)

string.forall(x=>x.isUpper)

val pairs= List(1,2,3,4,5) zip xs

pairs.unzip

string.flatMap(x=>List(".",x))

string.flatMap(x=>"."+x)

xs max

xs sum