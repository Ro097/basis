package com.luojun.basis

/**
  * @author luojun
  * @create 2021-06-15 22:51
  */
object tew {
    def main(args: Array[String]): Unit = {
        println("test1= " + test.t())
        println("test2= "+test.t(2.0))
        println("test3= "+test.t(y = 4.0))

        println(s"test4 = ${test.t()}")
    }
}
