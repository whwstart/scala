package com.atguigu.bigdata.scala.chapter05

object Scala05_Function_Hell_2 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 地狱版

        def fun( f : (Int, Int)=>Int ): Unit = {
            val r = f(10, 20)
            println(r)
        }

        fun( (x:Int, y:Int) => { x + y} )
        fun( (x:Int, y:Int) => x + y )
        // TODO 参数按照顺序只使用一次的时候，可以使用下划线代替参数，参数可以省略
        // 能省则省
        fun( (x, y) => y / x )
        //fun( (x, y) => _  )

        fun(_+_)


    }


}
