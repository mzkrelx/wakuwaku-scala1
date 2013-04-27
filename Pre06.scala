// match~case を使う
import java.util.Date

object Pre06 {

  def main(args: Array[String]) {

    // 例1
    val num = 1

    val daiji = num match {
      case 1 => "壱"
      case 2 => "弐"
      case _ => "参以上"
    }

    println(daiji)


    // 例2
    val date = new Date

    val msg = date.getDate match {
      case d if (d % 2 == 0) => "今日は偶数日です。"
      case _ => "今日は奇数日です。"
    }

    println(msg)

  }

}