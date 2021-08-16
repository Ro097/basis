package com.luojun.basis.fortest

/**
  * @author luojun
  * @create 2021-07-17 17:11
  */
object fortest1 extends  App {
    val list : List[String] = List("Luojun","Xiong")

    private val strings: List[String] = list flatMap(_.toSeq map(c=> s"""$c-${c.toUpper}"""))

    println(strings)

}
