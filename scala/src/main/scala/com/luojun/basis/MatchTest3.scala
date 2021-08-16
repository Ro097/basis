package com.luojun.basis

/**
  * @author luojun
  * @create 2021-07-03 18:57
  */
object MatchTest3 {
    def main(args: Array[String]): Unit = {
        val list = List(1, 2, 3, 4, 5)

        def windows[T](seq: Seq[T]): String = seq match {
            case head1 +: head2 +: tail => s"""($head1,$head2),""" + windows(tail)
            case head1 +: tail => s"""($head1,_)""" + windows(tail)
            case Nil => "Nil"
        }

        println(windows(list))
    }
}
