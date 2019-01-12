package assignment1_10_1_2019

import assignment2_11_1_2019.AssignmentQuestions

object ListUsingStringInterpolation extends App {
  val list: List[Int] = List(10, 50, 30, 40)
  val assignment=new AssignmentMethod
  println(assignment.printIndexWithEachElement(list))
  println(s"Maximum Number from list is ${assignment.maximumNumberInList(list)} ")
  println(s"Fibonacci = ${assignment.getFibonacci(5)}")
  println(s"factorial of a number is ${assignment.getFactorial(5)}")
  println(s"Fibonacci = ${assignment.Fibonacci(5)}")
  println(s"factorial of a number is ${assignment.factorial(5)}")


////Assignment-2 10/01.2019 question test from main

  val get=new AssignmentQuestions


  //ques-1

  for {i <- List.range(3, 7)}
    yield { print(s"${get.getFibonacciSeries(i)} , ") }


  //ques-2
  val length=5
  val breadth=5
  println()
  println(get.areaShape("rectangle",length,breadth,(length,breadth)=>length*breadth))
  println(get.areaShape("rhombus",length,breadth,(side1,side2)=>math.sqrt(side1*side1+side2*side2).toInt))
  println(get.areaShape("parallelogramm",length,breadth,(side1,side2)=>side1/side2))


  //ques-3
  val number1=5
  val number2=5
  println()

  println("sum of integer"+get.sumTest((a,b)=>a+b,number1,number2))
  println("sum of square"+get.sumTest((a,b)=>(a*a)+(b*b),number1,number2))
  println("sum of cube"+get.sumTest((a,b)=>(a*a*a)+(b*b*b),number1,number2))

}
