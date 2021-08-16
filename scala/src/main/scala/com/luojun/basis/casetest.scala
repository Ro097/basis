package com.luojun.basis

/**
  * @author luojun
  * @create 2021-06-15 22:41
  */
case class casetest(x : Double = 1.0,y : Double = 2.0) {
    val z=x+y
}

object es {
    def main(args: Array[String]): Unit = {
        val p1 = new casetest()
        println(p1.toString)
        val p2 = new casetest(y=1)
        println(p2)
        println(p2.z)
    }
}