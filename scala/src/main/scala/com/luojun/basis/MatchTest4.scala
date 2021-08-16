package com.luojun.basis

import scala.util.matching.Regex

/**
  * @author luojun
  * @create 2021-07-03 22:31
  */
object MatchTest4 {
    def main(args: Array[String]): Unit = {
        val BookExtractorRE: Regex ="""Book: title=([^,]+),\s+author=(.+)""".r
    }
}
