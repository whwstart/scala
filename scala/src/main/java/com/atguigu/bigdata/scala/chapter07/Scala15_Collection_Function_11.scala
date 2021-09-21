package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

object Scala15_Collection_Function_11 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数
        val list = ListBuffer(1,2,3,4)
        // 1-2-3-4
        // List(1), List(2,3,4)
        // List(1), List(-2,-3,-4)
        // List(1,-2,-3,-4)
        // List(1,-2,-3,-4).sum

        val ints: ListBuffer[Int] = list.tail.map(
            num => {
                -num
            }
        )
        ints.insert(0, list.head)
       // println(ints.sum)

        // TODO 马丁在集合中提供了一些用于计算的方法，开发人员只需要提供计算的规则，具体的集合由集合本身做
        // reduce(聚合， 简化，规约)
        // reduce方法可以将集合按照指定的计算规则进行计算，最后得到一个值
        // 这个计算是scala最基本的计算规则：两两计算 : 参数类型为 : (A1, A1) => A1
//        def reduceFunction( a : Int, b : Int ): Int = {
//            a - b
//        }
//
//        val i: Int = list.reduce(reduceFunction)
//
//        val i = list.reduce(
//            ( a : Int, b : Int ) => {
//                println("********************")
//                a + b
//            }
//        )
//        list.reduce(
//            ( a : Int, b : Int ) => a - b
//        )
//        list.reduce(
//            ( a, b ) => a - b
//        )
        // (A1, A1) => A1
        // reduce方法其实底层就是调用了reduceLeft
        val i = list.reduce(_ - _)
        // (B, Int) => B
        //val j = list.reduceLeft(_-_)

        // TODO reversed.reduceLeft[B]((x, y) => op(y, x))

        // 1 2 3 4 5
        // 5 4 3 2 1
        // (1-(2-(3-(4-5)))) => 3
        // 1-(2-(3-4)) => -2
        val k = list.reduceRight(_-_)
        println(i) // -13
        println(k) // -5

        // (((1+2)+3)=4)
        // (1-(2-(3-4)))

    }
}
