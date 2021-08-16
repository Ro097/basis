package hanshu

/**
  * @author luojun
  * @create 2021-07-17 15:18
  */
object foldtest2 extends App {
    val fibs : Stream[BigInt] =
        BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map(n => n._1+n._2)

    fibs take 10 foreach println
}
