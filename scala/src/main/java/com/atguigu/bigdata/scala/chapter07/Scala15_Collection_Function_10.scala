package com.atguigu.bigdata.scala.chapter07

object Scala15_Collection_Function_10 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数
        val list = List(1,5,4,2,3,6)

        val part: (List[Int], List[Int]) = list.partition(_ > 3)
        println(part)
    }
}
