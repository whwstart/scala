package com.atguigu.bigdata.scala.chapter07

object Scala04_Collection_Seq {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Seq - 序列
        // 默认情况下，scala提供的集合都是不可变的，
        //val seq = new Seq[String]()
        //val seq = Seq(1,2,3,4)
        val list = List(1,3,2,4)
        // TODO (插入)有序，数据可重复的集合
        // 一个对象能用什么方法和类型有关
        // 增加数据

        val list1 = 1 :: 2 :: 3 :: List(4)
        val list2 = 1 :: 2 :: 3 :: List()
        val list3 = 1 :: 2 :: 3 :: Nil
        val list4 = 1 :: 2 :: list3 :: Nil
        val list5 = 1 :: 2 :: list3 ::: Nil

        // TODO 将整体拆分成个体使用的方式称之为 【扁平化】


        println(list4)
        println(list5)




    }
}
