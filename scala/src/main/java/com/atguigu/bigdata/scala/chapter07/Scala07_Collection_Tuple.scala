package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable

object Scala07_Collection_Tuple {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - Tuple - 元组
        // TODO 【1, "zhangsan", 30】
//        val user = new User()
//        user.id = 1
//        user.name = "zhangsan"
//        user.age = 30
        // List[User]
        // List[String]
        // Scala中将无关的数据作为一个整体使用，形成一个元素的组合，简称为元组，称之为Tuple
        val tuple : Tuple3[Int, String, Int] = (1, "zhangsan", 30)
        val tuple1 : (Int, String, Int) = (1, "zhangsan", 30)
        // 因为数据无关，所以一般通过位置编号进行访问
        // 元组是有类型的，不能访问不存在的属性
        // 元组的类型是
        println(tuple._1)
        println(tuple._2)
        println(tuple._3)
        //println(tuple._4)

        tuple1.productElement(0)
        tuple1.productIterator
        //tuple1.




    }
    class User {
        var id : Int = _
        var name : String = _
        var age : Int = _
    }
}
