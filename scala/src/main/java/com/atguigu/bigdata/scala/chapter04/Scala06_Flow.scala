package com.atguigu.bigdata.scala.chapter04

import scala.util.control.Breaks._

object Scala06_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 运算符
        // scala中没有continue,break关键字
        // continue可以采用if条件进行处理，所以无需相关的功能
        // scala语言中使用面向对象的语法实现break操作
        breakable {
            for ( i <- 1 to 5 ) {
                if ( i == 3 ) {
                    break
                }
                println(i)
            }
        }


        println("abc")
    }
}
