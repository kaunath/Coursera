val list = List(1, 2, -3, 4, -5)

list.filter(x => x > 0)
list.filterNot(x => x > 0)
list.partition(x => x > 0)
// partiiton gives a pair of list which contains
//filter and filterNot in one go

list.takeWhile(x => x > 0)
list.dropWhile(x => x > 0)
list.span(x => x > 0)
//span gives a pair of list which contains takeWhile and
//dropWhile in one go