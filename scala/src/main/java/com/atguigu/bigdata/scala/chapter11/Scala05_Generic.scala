package com.atguigu.bigdata.scala.chapter11

import scala.collection.mutable

object Scala05_Generic {

    def main(args: Array[String]): Unit = {

        //val list = List(1,2,3,4)
        //list.fold("")(_+_)
        //list.foldLeft()

        val map1 = mutable.Map(
            ("a", 1), ("b", 2), ("c", 3)
        )
        val map2 = mutable.Map(
            ("a", 4), ("d", 5), ("c", 6)
        )

        val map3 = map2.foldLeft(map1)(
            (map, kv) => {
                val k = kv._1
                val v = kv._2

                val oldV = map.getOrElse(k, 0)
                map.put(k, oldV + v)

                map
            }
        )
        println(map3)





    }
}
