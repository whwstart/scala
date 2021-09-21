package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala06_Collection_Map {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Map
        // 键值对
        val kv = "a" -> 1

        // 不可变的Map集合
        // TODO 数据无序，kv键值对，k不能重复，v可以重复
//        val map = Map(
//            "a"->1, "b"->2, "c"->3, "d"->3, "a"->3
//        )
        // 可变的Map集合
        val map = mutable.Map(
            "a"->1, "b"->2, "c"->3
        )

        map.put("d", 4)

        //map.update("a", 5)
        map("a") = 5

        map.remove("c")

        //val keys: Iterable[String] = map.keys
        //map.keysIterator
        //map.values
        //map.valuesIterator

        println(map)




    }
}
