package com.atguigu.bigdata.scala.chapter07

object Scala16_Collection_ThreadSafe {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数
       val list = List(1,2,3,4)

        //println(list.scan(5)(_ - _))
       // println(list.scanLeft(5)(_ - _))
        // (1-(2-(3-(4-5))))
        println(list.scanRight(5)(_ - _))

    }
}
