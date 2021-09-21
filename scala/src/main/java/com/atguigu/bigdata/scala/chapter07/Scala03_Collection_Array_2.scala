package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala03_Collection_Array_2 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 数组 - 可变
        val array = Array(1,2,3,4)
        val buffer = ArrayBuffer(1,2,3,4)

        // 不可变 =》 可变
        val buffer1: mutable.Buffer[Int] = array.toBuffer
        println(buffer1)

        // 可变数组 => 不可变
        val array1: Array[Int] = buffer.toArray
        println(array1)


    }
}
