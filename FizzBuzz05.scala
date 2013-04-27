// map と無名関数を使う
object FizzBuzz05 {

  def main(args: Array[String]) {

    (1 to 20) map { x =>
      if (x % 3 == 0 && x % 5 == 0)
        "FizzBuzz"
      else if (x % 3 == 0)
        "Fizz"
      else if (x % 5 == 0)
        "Buzz"
      else
        x.toString
    } foreach println

  }
}