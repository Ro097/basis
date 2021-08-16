package hanshu

import scala.annotation.tailrec

/**
  * @author luojun
  * @create 2021-07-17 15:00
  */
object foldtest extends App {
    def reduceLeft[A, B](s: Seq[A])(f: A => B): Seq[B] = {
        @tailrec
        def rl(accum: Seq[B], s2: Seq[A]): Seq[B] = s2 match {
            case head +: tail => rl(f(head) +: accum, tail)
            case _ => accum
        }

        rl(Seq.empty[B], s)
    }

    def reduceRight[A, B](s: Seq[A])(f: A => B): Seq[B] = s match {
        case head +: tail => f(head) +: reduceRight(tail)(f)
        case _ => Seq.empty[B]
    }

    val list: List[Int] = List(1, 2, 3, 4, 5)

    val s1: Seq[String] = reduceLeft(list)(x => s"[$x]")

    val s2: Seq[String] = reduceRight(list)(x => s"[$x]")

    println("s1= " + s1)
    println("s2= " + s2)
}
