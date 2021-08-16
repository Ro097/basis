package com.luojun.basis.common

/**
  * @author luojun
  * @create 2021-07-05 22:34
  */
case class Mylist[A](list: List[A]) {
    def sortBy1[B](f: A => B)(implicit ord: Ordering[B]) = {
        list.sortBy(f)(ord)
    }

    def sortBy2[B: Ordering](f: A => B) = {
        list.sortBy(f)(implicitly[Ordering[B]])
    }
}
