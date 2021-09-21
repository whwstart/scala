package com.atguigu.bigdata.scala.chapter05

object Scala06_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 闭包
        // 如果一个函数使用了外部的变量，并且改变了这个变量的声明周期，将这个
        // 变量包含到函数的内部，形成一个闭合的环境，这个环境称之为闭包环境，简称闭包


        // scala2.12版本中闭包采用的编译时动态修改函数声明的方式来实现
        // scala2.12之前的版本中闭包采用的匿名函数类实现

        // TODO 闭包的场合
        //  1. 匿名函数都会有闭包
        //  2. 函数作为对象使用都会有闭包
        //  3. 内部函数在外部使用
//        def test( a : Int ) = {
//            def inner( b : Int ) = {
//                a + b
//            }
//            inner _
//        }
////
////        // 1. 函数编译后是一个方法
////        //println(test(10)(10))
//        val inner = test(10)
//        val r = inner(20)
//        println(r)

        val name = "zhangsan"

        def test(): Unit = {
            println(name)
        }

        val f = test _
        f()

    }


}
