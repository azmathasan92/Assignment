package assignment1_10_1_2019

object ListUsingStringInterpolation extends App {
  val list: List[Int] = List(10, 50, 30, 40)
  var max:Int=0;
  list.foreach {
    number =>println(s"${list.indexOf(number)} = $number")
      if(max<number){max=number}
  }
  println("Maximum Number from list is "+max)

  val fibonacci=new AssignmentMethod
  println(fibonacci.getFibonacci(2))
  println(fibonacci.getFibonacci(3))
  println(fibonacci.getFibonacci(4))
  println(fibonacci.getFibonacci(5))



  println(fibonacci.getFactorial(5))
}
