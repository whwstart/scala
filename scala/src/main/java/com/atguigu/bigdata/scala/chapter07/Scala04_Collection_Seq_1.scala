package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala04_Collection_Seq_1 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Seq - 序列 - 可变
        val buffer = ListBuffer(1,2,3,4)

//        buffer.append()
//        buffer.appendAll()
//
//        buffer.insert()
//
//        buffer.update()
//        buffer.updated()
//
//        buffer.remove()
//        buffer.remove()

        println(buffer)

        val list: List[Int] = buffer.toList
        val buffer1: mutable.Buffer[Int] = list.toBuffer
        //List.ra




    }
}
