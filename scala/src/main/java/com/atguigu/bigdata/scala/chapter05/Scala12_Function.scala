package com.atguigu.bigdata.scala.chapter05

object Scala12_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 惰性函数
        def fun9(): String = {
            println("function...")
            "zhangsan"
        }
        // 惰性函数可以延迟执行（加载）
        //lazy val a = fun9()
        lazy val a = fun9() // 10000 User Object
        println("----------") // 5min
        println(a)

        // function...
        // ----------
        // zhangsan

    }


}
