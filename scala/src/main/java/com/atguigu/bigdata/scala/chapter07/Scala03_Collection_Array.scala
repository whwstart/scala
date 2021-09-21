package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection_Array {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 数组 - 可变
        // 可变集合的常用方法推荐使用，容易理解
        val buff = ArrayBuffer(1,2,3,4)
        //val buff = new ArrayBuffer[String]()
        //val buff1 = ArrayBuffer("1", "2", "3")

        //val unit: Unit = buff.append("a", "b", "c")
        //val unit1: Unit = buff.appendAll(buff1)
        //buff.insert(1, 7, 8) // 1 7 8 2 3 4
        //buff.insert(10, 7, 8)

       // buff.update(1, 6) // 1 6 8 2 3 4
        //buff.update(10, 6)

        //buff.remove(3)
        //buff.remove(3,3)
        //buff.remove(1, 4)


        // Scala自己的集合可以直接打印
        println(buff)



    }
}
