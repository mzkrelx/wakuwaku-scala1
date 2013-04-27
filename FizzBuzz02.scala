// if が値を返す
object FizzBuzz02 {

  def main(args: Array[String]) {

    for (i <- 1 to 20) {
      val line = if (i % 3 == 0 && i % 5 ==0) {
        "FizzBuzz"
      } else if (i % 3 == 0) {
        "Fizz"
      } else if (i % 5 == 0) {
        "Buzz"
      } else {
        i
      }
      println(line)
    }

  }

}