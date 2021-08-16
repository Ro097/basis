package com.luojun.basis

import com.luojun.basis.common.Com

/**
  * @author luojun
  * @create 2021-07-05 22:24
  */
object ImplicitTest3 extends  App {
    def cal(amount: Double)(implicit rate : Double) = amount * rate
//    import Sim.rate
    import comp.rate
    implicit val com = Com(0.05,false,1010)
    println(cal(200))

}

