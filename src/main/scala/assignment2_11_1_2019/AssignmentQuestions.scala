package assignment2_11_1_2019

class AssignmentQuestions {


  def getFibonacciSeries(index: Int): Int = {
    def fibonacci(index: Int, prev: Int, current: Int): Int = {
      index match {
        case 0 => current
        case _=> fibonacci(index - 1, prev = prev + current, current = prev)
      }
    }
    fibonacci(index, prev = 1, current = 0)
  }

  def areaShape(shape: String, side1: Int, side2: Int, f:(Int,Int) => Int):String = {
    shape match {
      case "rectangle" => "area of rectangle is " + f(side1, side2)
      case "rhombus" => "area of rhombus is " + (f(side1, side2) * f(side1, side2) / 2)
      case "parallelogram" => "area of parallelogram is " + side2 * f(side1, side2)
      case _ => s"Not defined yet for $shape"
    }
  }
  def sumTest(f: (Int, Int) => Int, number1: Int, number2: Int): Int = {
       f(number1,number2)
    }

}

