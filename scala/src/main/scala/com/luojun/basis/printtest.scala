package com.luojun.basis

/**
  * @author luojun
  * @create 2021-04-28 23:00
  */
object printtest {

    /**
      * @deprecated 过期
      * @example testing code
      * @param args
      */

    //测试scala的字符串输出3中方式
    def main(args: Array[String]): Unit = {
        val name = "luojun"
        val age = 18
        val height: Double = 1.78

        //方式一  +
        print(name + "ds")  //输出：luojunds


        //方式一   printf
        printf("名字=%s 年龄=%d 身高=%.2f",name,age ,height) //输出：名字=luojun 年龄=18 身高=1.78

        //方式二  $引入变量
        print(s"\n 名字=$name 年龄=$age 身高=$height") //输出：名字=luojun 年龄=18 身高=1.78

        //可以在方式二中的变量进行运算
        print(s"\n 名字=${name + " v"} 年龄=${age + 1} 身高=${height + 0.2}")
        //输出：名字=luojun v 年龄=19 身高=1.98
    }
}
