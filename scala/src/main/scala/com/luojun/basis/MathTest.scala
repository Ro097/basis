package com.luojun.basis

import com.luojun.basis.common.{Address, Person}

/**
  * @author luojun
  * @create 2021-07-03 17:53
  */
object MathTest {
    def main(args: Array[String]): Unit = {

        val ro = Person("luojun",27,Address("zhajaing","hengyang","zhongguo"))
        val xun = Person("xiongxunhong",28,Address("fengxing","yichun","zhongguo"))
        val han = Person("xiongpeihan",6,Address("fengxing","yichun","zhongguo"))

        for (seq <- Seq(ro,xun,han)) seq match {
            case f@Person("luojun",_,_) => println(s""""你是帅哥${f}""")
            case f@Person("xiongxunhong",_,_) => println(s"""你是渣女${f}""")
            case f@Person(naem,age,_) => println(s"""你是小孩${f}""")
        }

    }
}
