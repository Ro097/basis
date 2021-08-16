package com.luojun.basis.fortest

import scala.io.Source

/**
  * @author luojun
  * @create 2021-07-17 16:08
  */
object RemoveBlanks {

    def apply(path: String, compressWhiteSpace: Boolean = false): Seq[String] =
        for {
            line <- Source.fromFile(path).getLines().toSeq
            if !line.matches("""^\s*S$""")
            line2 = if (compressWhiteSpace) line replaceAll("""\s+""", " ")
            else line
        } yield line2

    def main(args: Array[String]): Unit = for {
        path2 <- args
        (compress, path) = if (path2 startsWith "-") (true, path2.substring(1))
        else (false, path2)
        line <- apply(path,compress)
    } println(line)
}

