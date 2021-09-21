package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

object Scala09_Collection_Function_4 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数
        //val list1 = List(1,2,3,4)

//        val a = for ( i <- list1 ) yield {
//            i * 2
//        }
//        println(a)

//        val buffer = ListBuffer[Int]()
//
//        list1.foreach(
//            num => {
//                buffer.append(num * 2)
//            }
//        )
//
//        println(buffer)

        // TODO 功能函数 - map

        // A => B (转换，映射)
        // 1 => 2
        // 2 => 4
        val list = List(1,2,3,4)
        // map方法作用是将集合中的每一条数据进行转换映射。产生新的集合
        // map方法需要传递一个参数，这个参数的类型为 Int => B
//        val mapList = list.map(
//            num => {
//                num * 2
//            }
//        )

        val mapList1 = list.map( (num:Int) => {num * 2} )
        val mapList2 = list.map( _ * 2 )
        //println(mapList)

    }
}
