package com.atguigu.bigdata.scala.chapter07

object Scala12_Collection_Par {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Par
        val result1 = (0 to 100).map{x => Thread.currentThread.getName}
        val result2 = (0 to 100).par.map{x => Thread.currentThread.getName}

        println(result1)
        println(result2)

    }
}
