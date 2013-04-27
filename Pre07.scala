// map と match の省略
object Pre07 {

  def main(args: Array[String]) {

    val daijis = (1 to 5) map { num =>
      num match {
        case 1 => "壱"
        case 2 => "弐"
        case _ => "参以上"
      }
    }

    // 省略形
    val daijis2 = (1 to 5) map {
      case 1 => "壱"
      case 2 => "弐"
      case _ => "参以上"
    }

  }

}