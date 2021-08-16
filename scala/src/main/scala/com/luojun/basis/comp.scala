package com.luojun.basis

import com.luojun.basis.common.Com

/**
  * @author luojun
  * @create 2021-07-05 22:26
  */
object comp {

    private def extra(id : Int)= {
        0.3
    }

    implicit def rate(implicit cstd : Com) = {
        if (cstd.is) 0.0
        else cstd.baseRate + extra(cstd.stroeId)
    }
}
