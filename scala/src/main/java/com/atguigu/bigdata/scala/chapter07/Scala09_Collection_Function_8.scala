package com.atguigu.bigdata.scala.chapter07

object Scala09_Collection_Function_8 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数 -
        val list = List(
            ("Hello", 2), ("Hello", 4), ("Scala", 6)
        )

        // A, C, E
        // B, D, F
//        val mapList = list.map(
//            t => {
//                (t._1, t._2 * 2)
//            }
//        )
        val mapList = list.toMap.mapValues(_*2)
        println(mapList)


    }
}
