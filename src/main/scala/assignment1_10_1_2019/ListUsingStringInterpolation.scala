package assignment1_10_1_2019

object ListUsingStringInterpolation extends App {
  val list: List[Int] = List(10, 50, 30, 40)
  val assignment=new AssignmentMethod
  println(assignment.printIndexWithEachElement(list))
  println(s"Maximum Number from list is ${assignment.maximumNumberInList(list)} ")
  println(s"fobonacci = ${assignment.getFibonacci(5)}")
  println(s"factorial of a number is ${assignment.getFactorial(5)}")
}
