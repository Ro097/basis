package com.luojun.basis

import com.luojun.basis.common.With

/**
  * @author luojun
  * @create 2021-07-03 18:14
  */
object MatchTest2 {
    def main(args: Array[String]): Unit = {
        val p1 = With("luojun",25)
        val p2 = With("xun",24)

        for (seq <- Seq(p1,p2)) seq match {
            case s With i => println(s"""$s with $i""")
            case name => println(s"""Unknow: $name""")
        }
    }
}
