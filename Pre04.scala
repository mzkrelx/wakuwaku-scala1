// map と高階関数を使う
object Pre04 {

  def main(args: Array[String]) {

    def twice(x: Int) = x * 2

    (1 to 5) map { x => twice(x) } foreach println

    // 省略形
    (1 to 5) map { twice(_) } foreach println
    (1 to 5) map { twice } foreach println
    (1 to 5) map twice foreach println  // やりすぎ?


    // foreach println も同じ形でした
    (1 to 5) foreach { x => println(x) }
    (1 to 5) foreach { println(_) }
    (1 to 5) foreach println

  }

}