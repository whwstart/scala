package com.atguigu.bigdata.scala.chapter07

object Scala09_Collection_Function_5 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数 - flatten
//        val list = List(
//            List(1,2), List(3,4)
//        )

        // List(1,2,3,4)
        // 将整体拆分成个体来使用，可以使用扁平化操作
//        println(list)
//        println(list.flatten)
        val list = List(
            "Hello Scala", "Hello Spark"
        )

       // println(list.flatten)
        val flatList = list.flatMap(
            s => {
                s.split(" ")
            }
        )
        println(flatList)

    }
}
