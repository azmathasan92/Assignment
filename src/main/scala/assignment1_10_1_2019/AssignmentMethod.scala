package assignment1_10_1_2019

class AssignmentMethod {
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
