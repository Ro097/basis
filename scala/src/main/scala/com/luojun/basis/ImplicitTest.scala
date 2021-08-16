package com.luojun.basis

import java.util.{HashMap => javaHashMap}
import scala.collection.mutable.{HashMap => scalaHashMap}

/**
  * @author luojun
  * @create 2021-07-05 22:01
  */
object ImplicitTest extends App {
    val javamap = new javaHashMap[Int, String]()
    val scalaHashMap = new scalaHashMap[Int, String]()

    javamap.put(1,"luo")
    javamap.put(2,"jun")

    for (key <- javamap.keySet().toArray() reverse){
        scalaHashMap += (key.asInstanceOf[Int] -> javamap.get(key))
        println(scalaHashMap)
    }
    println(scalaHashMap)
}
