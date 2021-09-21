package com.atguigu.bigdata.scala.chapter08

object Scala06_Match {

    def main(args: Array[String]): Unit = {
        // 模式匹配
        // 全 ：全函数
        // 偏 ：偏函数(满足条件的数据进行处理的函数)
//        val list = List(1,2,"3",4)
//        // List(2,3,"3",5)
//        val list1 = list.map(
//            data => {
//                data match {
//                    case i:Int => i + 1
//                    case s : String => s
//                }
//            }
//        )
//        println(list1)

        // 将该List(1,2,3,4,5,6,"test")中的Int类型的元素加一，并去掉字符串。
        val list : List[Any] = List(1,2,3,4,5,6,"test")
//        list.map(
//            num => {
//                num + 1
//            }
//        ).filter(_.isInstanceOf[Int])
        //val list1 = list.filter(_.isInstanceOf[Int]).map(_.asInstanceOf[Int]+1)
        //print(list1)
        val list1 = list.map {
            case i:Int => i+1
            case s => s
        }.filter(_.isInstanceOf[Int])

        // 如果只考虑对满足条件的数据进行处理，那么可以使用偏函数，但是不是所有的函数都支持偏函数
        val list2 = list.collect{case i:Int=>i+1}
        print(list2)

    }
}
