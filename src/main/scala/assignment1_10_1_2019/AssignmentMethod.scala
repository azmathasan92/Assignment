package assignment1_10_1_2019

class AssignmentMethod {
  def printIndexWithEachElement(list: List[Int]): List[Int] = {
    def printElement(elements: List[Int], list: List[Int]): List[Int] = {
      elements match {
        case Nil =>
          list
        case head :: tail => val index = indexOfElement(head, list)
          println(s"$index = $head")
          printElement(tail, list)
        case _ => throw new NoSuchElementException
      }
    }
    printElement(list, list)
  }
  def indexOfElement(element: Int, list: List[Int]): Int = {
    def findIndex(index: Int, list: List[Int]): Int = {
      list match {
        case head :: Nil => if(head == element) index
        else throw new NoSuchElementException
        case head :: tail => if(head == element) index
        else findIndex(index + 1, tail)
        case _ => throw new NoSuchElementException
      }
    }
    findIndex(0, list)
  }
  def maximumNumberInList(list: List[Int]): Option[Int] = list match {
    case Nil => None
    case List(x: Int) => Some(x)
    case x :: y :: rest => maximumNumberInList( (if (x > y) x else y) :: rest )
  }
  def getFibonacci(index: Int): Int = {
    if (index <= 0) {
      0
    } else if (index == 1) {
      1
    } else {
      getFibonacci(index - 1) + getFibonacci(index - 2)
    }
  }
  def getFactorial(n: BigInt): BigInt = {
    def go(acc: BigInt, n: BigInt): BigInt = {
      if (n <= 1)
        acc
      else
        go(acc * n, n - 1)
    }
    go(1, n)
  }

}
