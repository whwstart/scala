package com.atguigu.bigdata.scala.chapter07

object Scala02_Collection_Array_2 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 数组 - scala中集合默认为不可变
        // 多维数组
        var myMatrix = Array.ofDim[Int](3,3)
        //myMatrix.foreach(list=> println(list.mkString(",")))

        //myMatrix.foreach(array => println(array.mkString(",")))

        // 合并数组
        val arr1 = Array(1,2,3)
        val arr2 = Array(4,5,6)
        val arr6: Array[Int] = Array.concat(arr1, arr2)
        //arr6.foreach(println)

        // 创建指定范围的数组
        //val arr7: Array[Int] = Array.range(0,2) // Range(0,2)
        //arr7.foreach(println)

        // 创建并填充指定数量的数组
        val arr8:Array[Int] = Array.fill[Int](2)(-1)
        arr8.foreach(println)

        new Thread().start()


    }
}
