// map と match の省略
object FizzBuzz07 {

  def main(args: Array[String]) {

    1 to 20 map {
      case x if (x % 3 == 0 && x % 5 == 0) => "FizzBuzz"
      case x if (x % 3 == 0) => "Fizz"
      case x if (x % 5 == 0) => "Buzz"
      case x => x
    } foreach println

  }
}