package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

object Scala15_Collection_Function_12 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数
       val list = List(1,2,3,4)
       val num = 5
        // 集合内部和集合的外部进行聚合操作
        //List(1,2,3,4) => "1234"
        //list.map(_.toString).reduce(_+_)
        // ""+1+2+3+4 => 1234

        // 使用fold方法实现集合内部和外部的聚合
        // fold方法存在函数柯里化操作
        // 第一个参数列表表示集合之外的计算初始值
        // 第二个参数列表表示计算规则：两两计算
        // fold方法表示折叠
        //val i = list.fold(num)(_+_)
        //println(i)

        // fold方法要求初始化计算的值应该和集合中的原始的值相同类型
        // (A1)(A1,A1)=>A1
        //list.fold("")(_+_)

        //val str: String = list.foldLeft("")(_ + _)

        // reverse.foldLeft(z)((right, left) => op(left, right))

        // 1 2 3 4
        // 4 3 2 1
        // 5 4 3 2 1
        // (1+(2+(3+(4+""))))
        //val str = list.foldRight(5)(_ - _)
        val str = list.foldRight("")(_ + _)
        println(str)

    }
}
