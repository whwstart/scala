package com.atguigu.bigdata.scala.chapter07

object Scala09_Collection_Function_3 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数
        val list1 = List(1,2,3,4)
        val list2 = List(3,4,5,6,7)

        // 双集合操作 : 交集，并集，差集
        // 交集：两个数据集合中交叉的部分
        println(list1.intersect(list2)) // 3, 4
        // 并集：两个数据集合的合并
        println(list1.union(list2))// 1,2,3,4,3,4,5,6
        // 差集：
        println(list1.diff(list2)) // 1,2

        // 拉链
        val tuples: List[(Int, Int)] = list1.zip(list2)
        println(tuples)
        println(list1.zipWithIndex)



    }
}
