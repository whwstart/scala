package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala06_Collection_Map_1 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Map
        val map = mutable.Map(
            "a"->1, "b"->2, "c"->3
        )

        //map.put("a", 4)
        //val maybeInt: Option[Int] = map.put("d", 5)
        // Option 其实是scala中的特殊类型，表示选项 ： Some, None
        // Option类型对象中有一个方法：get, 但是不能直接使用
//        if ( !maybeInt.isEmpty ) {
//            println(maybeInt.get)
//        } else {
//            println("没有数据")
//        }

        // Option类型为了操作方便，还提供了一个方法
//        val i: Int = maybeInt.getOrElse(0)
//        println(i)

//        val i: Int = map.getOrElse("e", 0)
//        println(i)
//
//        val maybeInt1: Option[Int] = map.get("e")

        //val i: Int = map.getOrElseUpdate("e", 10)
        val i: Int = map.getOrElse("e", 10)
        println(i)
        println(map)




    }
}
