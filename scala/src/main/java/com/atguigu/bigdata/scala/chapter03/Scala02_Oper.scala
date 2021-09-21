package com.atguigu.bigdata.scala.chapter03

import scala.io.{BufferedSource, Source}

object Scala02_Oper {

    def main(args: Array[String]): Unit = {

        // TODO 运算符

        // scala语言是一个完全面向对象的语言，所以万物皆对象
        // 所以数字也是对象,运算符其实就是对象的方法
        // 1. 如果调用对象的方法，那么点可以省略的
        // 2. 如果参数是一个，或没有，那么小括号可以省略的
        //1.+(1)

        //1 +(1)

        //println(1 toString)

        1 + 1
        //val i: Int = 1.+(1)

        println("程" * 2)
    }
}
