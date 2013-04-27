// for が値を返す、foreach を使う
object Pre03 {

  def main(args: Array[String]) {

//    省略前
//    val lines = for (i <- 1 to 5) yield {
//      val moji = if (i == 1) {
//        "壱"
//      } else if (i == 2) {
//        "弐"
//      } else {
//        "参以上"
//      }
//      moji
//    }

//    省略後
    val lines = for (i <- 1 to 5) yield
      if (i == 1)
        "壱"
      else if (i == 2)
        "弐"
      else
        "参以上"

    lines foreach println

  }

}