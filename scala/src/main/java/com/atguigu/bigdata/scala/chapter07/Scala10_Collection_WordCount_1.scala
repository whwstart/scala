package com.atguigu.bigdata.scala.chapter07

import scala.io.{BufferedSource, Source}

object Scala10_Collection_WordCount_1 {

    def main(args: Array[String]): Unit = {

        val source: BufferedSource = Source.fromFile("data/word.txt")
        val strings: Iterator[String] = source.getLines()
        val lineList: List[String] = strings.toList
        source.close()


        val top3 =
            lineList
                .flatMap(_.split(" "))
                .groupBy( word => word ) // TODO 不要简化
                .mapValues(_.size)
                .toList
                .sortBy(t => t._2)(Ordering.Int.reverse)
                .take(3)

        println(top3)


    }

}
