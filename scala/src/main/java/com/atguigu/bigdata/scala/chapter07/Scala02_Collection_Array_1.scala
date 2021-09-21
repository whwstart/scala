package com.atguigu.bigdata.scala.chapter07

object Scala02_Collection_Array_1 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 数组 - scala中集合默认为不可变

        // 不可变集合的方法基本上都是运算符操作，不推荐记忆，容易混乱

        // 构建数组 - 常见方式
        // new String[]{"a", "b", "c"}
        val array: Array[Int] = Array.apply(4,5,6)
        val array1: Array[Int] = Array(1, 2, 3)

        //val ints: Array[Int] = array1.:+(4)
        //val ints1: Array[Int] = array1.+:(5)

        // 如果运算符使用冒号结尾，那么运算规则为从右向左
        val ints: Array[Int] = array1 :+ 4
        val ints1: Array[Int] = 5 +: array1 // array1.+:(5)

        val ints2: Array[Int] = array1.++:(array) // array ++: array1

        //println(array1 eq ints)
        println(array1.mkString(","))
        println(ints.mkString(","))
        println(ints1.mkString(","))
        println(ints2.mkString(","))



    }
}
