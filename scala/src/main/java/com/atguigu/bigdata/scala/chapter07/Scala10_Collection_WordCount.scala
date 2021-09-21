package com.atguigu.bigdata.scala.chapter07

import scala.io.{BufferedSource, Source}

object Scala10_Collection_WordCount {

    def main(args: Array[String]): Unit = {

        // TODO WordCount
        // TODO 从文件获取单词，统计单词出现的次数，并排序(降序)取前3名

        // 1. 此文件中获取原始数据
        //    line, line, line
        val source: BufferedSource = Source.fromFile("data/word.txt")
        val strings: Iterator[String] = source.getLines()
        val lineList: List[String] = strings.toList
        source.close()

        // 2. 将原始数据分解成一个一个的单词
        //    line => word, word, word
        val wordsList = lineList.flatMap(
            line => {
                line.split(" ")
            }
        )

        // 3. 将相同的单词分在一个组中，方便统计
        //   word => Map[ word, List( word, word, word ) ]
        val wordGroupMap: Map[String, List[String]] = wordsList.groupBy(
            word => word
        )

        // 4. 对分组后的数据进行统计
        //  Map[ word, List( word, word, word ) ]
        // =>
        //  Map[Word, Count]
        val wordCountMap: Map[String, Int] = wordGroupMap.map(
            kv => {
                (kv._1, kv._2.size)
            }
        )

        // 5. 对统计结果进行排序（降序），取前3名
        val top3: List[(String, Int)] = wordCountMap.toList.sortBy(
            t => t._2
        )(Ordering.Int.reverse).take(3)

        // 6. 将结果打印在控制台上。
        println(top3)


    }

}
