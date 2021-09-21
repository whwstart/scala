package com.atguigu.bigdata.scala.chapter07

object Scala14_Collection_Test {

    def main(args: Array[String]): Unit = {

        // TODO 不同省份的商品点击排行

        // word => count
        // 省份-商品  => 点击
        val list = List(
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "鞋"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "鞋"),
            ("zhangsan", "河北", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "帽子"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "电脑"),
            ("zhangsan", "河南", "鞋"),
            ("lisi", "河南", "衣服"),
            ("wangwu", "河南", "电脑"),
            ("zhangsan", "河南", "电脑"),
            ("lisi", "河北", "衣服"),
            ("wangwu", "河北", "帽子")
        )

        // 转换数据格式
        val wordsList:List[String] = list.map(
            t => {
                // 省份-商品
                t._2 + "-" + t._3
            }
        )

        val wordCount: List[(String, Int)] =
            wordsList.groupBy(word => word) // TODO 不要简化
                .mapValues(_.size)
                .toList

        // 省份-商品  => 点击
        // 转换结构
        // 省份, (商品,点击)

        val result = wordCount.map(
            t => {
                val key = t._1
                val cnt = t._2
                val ks = key.split("-")
                (ks(0), (ks(1), cnt))
            }
        )

        val groupData: Map[String, List[(String, (String, Int))]] = result.groupBy(_._1)

        val result1 = groupData.mapValues(
            list => {
                val tuples: List[(String, Int)] = list.map(_._2)
                tuples.sortBy(_._2)(Ordering.Int.reverse)
            }
        )

        println(result1)



    }

}
