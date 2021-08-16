package com.luojun.basis

import com.luojun.basis

/**
  * @author luojun
  * @create 2021-06-29 23:47
  */
object EnumerationTest extends Enumeration {
    val er = Value("fd")
    val es = Value("sd")
}

object sd{
    import EnumerationTest._
    def isEvent(b: Value) = b.toString.contains("s")
    def main(args: Array[String]): Unit = {
        val values: basis.EnumerationTest.ValueSet = EnumerationTest.values
//        println(EnumerationTest.values)
        EnumerationTest.values.filter(isEvent).foreach(print)
    }
}