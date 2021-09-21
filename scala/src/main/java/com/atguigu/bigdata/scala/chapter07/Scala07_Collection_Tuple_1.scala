package com.atguigu.bigdata.scala.chapter07

object Scala07_Collection_Tuple_1 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Tuple - 元组
        val t = (1, "zhangsan", 30)
        //t -> 2 -> 3 -> 4 -> 5

        // 如果元组的元素只有2个，称之为对偶元组，也称之为键值对对象
        //"a" -> 1
        //("a", 1)
        val map = Map(
            ("a", 1), ("b", 2), ("c", 3)
        )

        //println(map)
//        for ( t <- map ) {
//            println(t._1 + "=" + t._2)
//        }

        // foreach将集合中的每一个元素进行处理
        map.foreach(
            kv => {
                println(kv._1 + "=" + kv._2)
            }
        )



    }

}
