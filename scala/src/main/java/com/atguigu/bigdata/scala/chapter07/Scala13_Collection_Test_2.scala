package com.atguigu.bigdata.scala.chapter07

object Scala13_Collection_Test_2 {

    def main(args: Array[String]): Unit = {

        // TODO WordCount
        val list = List(
            ("hello", 4),
            ("hello spark", 3), // (hello, 3), (spark, 3)
            ("hello spark scala", 2), // (hello,2)
            ("hello spark scala hive", 1) //(hello, 1)
        )

        // (hello, 4)(spark, 3)(hello, 3)(spark, 3)(hello, 2)(hello, 1)
        // =>
        // (hello, 4)(hello, 3)(hello, 2)(hello, 1)
        // =>
        // 4,3,2,1
        // sum
        // =>
        // (hello, 10)
        // 进行扁平化操作
        val flatList = list.flatMap(
            t => {
                val str = t._1
                val cnt = t._2
                val words = str.split(" ")
                //words.map((_, cnt))
                words.map(
                    word => {
                        (word, cnt)
                    }
                )
            }
        )

        val groupMap: Map[String, List[(String, Int)]] = flatList.groupBy(_._1)

        val wordCountMap = groupMap.mapValues(
            list => {
                list.map(_._2).sum
            }
        )

        println(wordCountMap)




    }

}
