val list = List(1,23)
list match {
  case first :: second:: Nil  => (first, second)
  case _ => "wild card"
}

val list1:List[Int]=Nil