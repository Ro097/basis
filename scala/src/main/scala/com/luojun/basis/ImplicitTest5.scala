package com.luojun.basis

import com.luojun.basis.common.{Mylist => list}

/**
  * @author luojun
  * @create 2021-07-05 22:34
  */
object ImplicitTest5 extends App {

    val lists = list(List(1,4,2,3))

//    println(lists.sortBy1(i => i))
    println(lists.sortBy2(i => i))
}
