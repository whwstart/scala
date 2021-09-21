package com.atguigu.bigdata.scala.chapter07

object Scala09_Collection_Function_6 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数 - filter
        val list = List(1,2,3,4)
        val list1 = List("Hadoop", "Hive", "Scala", "Spark")
        // filter方法主要作用是根据指定的规则对集合的每一条数据进行筛选过滤
        // 每一条数据的处理结果为true，数据保留，为false,数据丢弃
//        val filterList = list.filter(
//            num => {
//                num % 2 != 0
//            }
//        )
//
//        println(filterList)
        val filterList = list1.filter(
            s => {
                s.startsWith("S")
            }
        )
        println(filterList)

    }
}
