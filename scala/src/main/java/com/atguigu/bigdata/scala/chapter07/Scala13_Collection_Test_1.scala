package com.atguigu.bigdata.scala.chapter07

import scala.io.{BufferedSource, Source}

object Scala13_Collection_Test_1 {

    def main(args: Array[String]): Unit = {

        // TODO WordCount
        val list = List(
            ("hello", 4),
            ("hello spark", 3),
            ("hello spark scala", 2),
            ("hello spark scala hive", 1)
        )
        //  将上面的数据进行WordCount后排序取前三名！
        val fileList : List[String] = List(
            "hello scala",
            "hello scala",
            "hello scala",
            "hello scala"
        )

        val mapList = list.map(
            t => (t._1 + " ") * t._2
        )


        val top3 =
            mapList
                .flatMap(_.split(" "))
                .groupBy( word => word ) // TODO 不要简化
                .mapValues(_.size)
                .toList
                .sortBy(t => t._2)(Ordering.Int.reverse)
                .take(3)

        println(top3)


    }

}
