// 再起を使う クロージャ, コンス(分ける方)
import scala.collection.mutable.ListBuffer

object FizzBuzz08 {

  def main(args: Array[String]) {

    val lines = new ListBuffer[String]

    def fizzbuzzRec(numbers: List[Int]) {
      numbers match {
        case Nil =>
        case number :: tail => {
          lines.append(number match {
            case x if (x % 3 == 0 && x % 5 == 0) => "FizzBuzz"
            case x if (x % 3 == 0) => "Fizz"
            case x if (x % 5 == 0) => "Buzz"
            case x => x.toString
          })
          fizzbuzzRec(tail)
        }
      }
    }

    fizzbuzzRec(1 to 20 toList)
    lines foreach println
  }
}