package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection_Array_1 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 数组 - 可变
        val buff = ArrayBuffer(1,2,3,4)
        val buff1 = ArrayBuffer(1,2,3,4)

        // 使用运算符操作，可以让可变数组产生新集合
        //val ints: ArrayBuffer[Int] = buff :+ 5
        //val ints1: ArrayBuffer[Int] = 6 +: buff

        //println(buff eq ints)
        //println(buff eq ints1)

        //buff.update(0,5)
        //buff(0) = 5
        // 了
//        val ints: ArrayBuffer[Int] = buff.updated(0, 5)
//
//        println(buff)
//        println(ints)

//        val ints1: ArrayBuffer[Int] = buff ++ buff1
//        val value: Any = buff += buff1
        //println(buff eq ints1)



    }
}
