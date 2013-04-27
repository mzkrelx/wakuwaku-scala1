// map と高階関数を使う
object FizzBuzz04 {

  def main(args: Array[String]) {

    def fizzbuzz(i: Int): String =
      if (i % 3 == 0 && i % 5 == 0)
        "FizzBuzz"
      else if (i % 3 == 0)
        "Fizz"
      else if (i % 5 == 0)
        "Buzz"
      else
        i.toString()

    (1 to 20) map { x =>
      fizzbuzz(x)
    } foreach println

//    省略形
//    1 to 20 map { fizzbuzz } foreach println

  }
}