// 基本形
object FizzBuzz01 {

  def main(args: Array[String]) {

    for (i <- 1 to 20) {
      if (i % 3 == 0 && i % 5 ==0) {
        println("FizzBuzz")
      } else if (i % 3 == 0) {
        println("Fizz")
      } else if (i % 5 == 0) {
        println("Buzz")
      } else {
        println(i)
      }
    }

  }

}