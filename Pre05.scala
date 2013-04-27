// map と無名関数を使う
object Pre05 {

  def main(args: Array[String]) {

//    Pre04の例
//    def twice(x: Int) = x * 2
//    (1 to 5) map { x => twice(x) } foreach println

    // 無名関数に変形
    (1 to 5) map { (x: Int) => x * 2 } foreach println
    (1 to 5) map { x => x * 2 } foreach println
    (1 to 5) map { _ * 2 } foreach println

  }

}