package com.atguigu.bigdata.scala.chapter07

object Scala09_Collection_Function_7 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数 - groupBy
        //val list = List(1,2,3,4)
        // groupBy是按照指定的规则进行分组
        // groupBy方法需要传递一个参数，参数的类型： Int => K(分组标识)
        // 相同标识的数据会放置在一起
        // groupBy返回结果为Map类型，其中的key就是分组标识，其中value就是相同标识的数据集合
        // ( "数字", List(1,2,3,4) )
//        val map = list.groupBy(
//            num => {
//                if ( num % 2 == 0 ) {
//                    true
//                } else {
//                    false
//                }
//            }
//        )
        //val map = list.groupBy(_%2)
        val list = List(
            "Hello", "Hive", "Scala", "Spark", "Hello", "Hive", "Spark"
        )
        // H, S
        val map = list.groupBy(
            s => {
                s
            }
        )

        println(map)


    }
}
