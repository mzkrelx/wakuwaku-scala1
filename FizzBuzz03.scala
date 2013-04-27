// for が値を返す、foreach を使う
object FizzBuzz03 {

  def main(args: Array[String]) {

    val lines = for (i <- 1 to 20) yield
      if (i % 3 == 0 && i % 5 ==0) {
        "FizzBuzz"
      } else if (i % 3 == 0) {
        "Fizz"
      } else if (i % 5 == 0) {
        "Buzz"
      } else {
        i
      }
    lines foreach println

  }

}