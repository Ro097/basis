package com.luojun.basis

/**
  * @author luojun
  * @create 2021-07-05 22:21
  */
object ImplicitTest2 extends App {

    def cal(amount : Double)(implicit rate : Double) = amount * rate

    implicit val ds = 0.5

    println(cal(200))
}
