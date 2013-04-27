// 末尾再起を使う、コンス(連結する方)
import scala.annotation.tailrec

object FizzBuzz09 {

  def main(args: Array[String]) {

    def fizzbuzzRec(numbers: List[Int]): List[String] = {

      @tailrec
      def fizzbuzzRecLocal(accumulator: List[String],
          numbers: List[Int]): List[String] = {
        numbers match {
          case Nil => accumulator
          case number :: tail => fizzbuzzRecLocal(
            accumulator ::: List(
              number match {
                case x if (x % 3 == 0 && x % 5 == 0) => "FizzBuzz"
                case x if (x % 3 == 0) => "Fizz"
                case x if (x % 5 == 0) => "Buzz"
                case x => x.toString
              }
            ), tail
          )
        }
      }

      fizzbuzzRecLocal(Nil, numbers)
    }

    fizzbuzzRec(1 to 20 toList) foreach println
  }
}