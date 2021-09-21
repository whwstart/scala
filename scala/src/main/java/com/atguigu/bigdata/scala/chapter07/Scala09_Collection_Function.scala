package com.atguigu.bigdata.scala.chapter07

object Scala09_Collection_Function {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数
        val list = List(1,2,3,4)

        println(list.size)
        println(list.length)
        println(list.isEmpty)
        println(list.contains(1))

        list.iterator
        list.productIterator
        list.mkString(",")
        list.foreach(println)
    }
}
