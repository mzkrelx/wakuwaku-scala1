// if が値を返す, var, val, javaのクラス
import java.util.Date

object Pre02 {

  def main(args: Array[String]): Unit = {

    val date = new Date

    // Bad if
    var varMsg: String = null
    if (date.getDate % 2 == 0) {
      varMsg = "今日は偶数日です。"
    } else {
      varMsg = "今日は奇数日です。"
    }
    println(varMsg)

    // Good if
    val valMsg = if (date.getDate % 2 == 0) {
      "今日は偶数日です。"
    } else {
      "今日は奇数日です。"
    }
    println(valMsg)
  }

}

