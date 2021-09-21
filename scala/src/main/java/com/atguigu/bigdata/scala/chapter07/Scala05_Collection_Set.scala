package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala05_Collection_Set {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Set - 集
        // DataSet
        // TODO 无序，数据不可重复
        //val set = Set(1,2,3,4,1,2,3,4)

        // 默认的Set集合是不可变的，所以提供的方法都是运算符的操作,不推荐大家使用
        // TODO 可变Set集合
        val set = mutable.Set(1,2,3,4)


        // 增加数据
        //set.add(5)
        // 修改数据
        //set.update(3, false)
        // 删除数据
        set.remove(2)

        println(set.mkString(","))
        set.foreach(println)
        println(set)





    }
}
