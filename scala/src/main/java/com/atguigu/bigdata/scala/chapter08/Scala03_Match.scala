package com.atguigu.bigdata.scala.chapter08

object Scala03_Match {

    def main(args: Array[String]): Unit = {
//        for (arr <- Array(
//                Array(0),
//                Array(1, 0),
//                Array(0, 1, 0),
//                Array(1, 1, 0),
//                Array(1, 1, 0, 1),
//                Array("hello", 90))) { // 对一个数组集合进行遍历
//
//            val result = arr match {
//                case Array(0) => "0" //匹配Array(0) 这个数组
//                case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的x,y
//                case Array(0, _*) => "以0开头的数组" //匹配以0开头和数组
//                case _ => "something else"
//            }
//            println("result = " + result)
//        }

//        for (list <- Array(
//                List(0),
//                List(1, 0),
//                List(0, 0, 0),
//                List(1, 0, 0),
//                List(88))) {
//            val result = list match {
//                case List(0) => "0" //匹配List(0)
//                case List(x, y) => x + "," + y //匹配有两个元素的List
//                case List(0, _*) => "0 ..."
//                case _ => "something else"
//            }
//
//            println(result)
//        }

        //val list: List[Int] = List(1)



        // 1 :: 2 :: Nil :: Nil

//        list match {
//            case first :: second :: rest => println(first + "-" + second + "-" + rest)
//            case _ => println("something else")
//        }

//        val list1 = 1 ::  Nil :: Nil
//        println(list1)

        // 匹配元组
        for (tuple <- Array(
                (0, 1),
                (1, 0),
                (1, 1),
                (1, 0, 2))) {
            val result = tuple match {
                case (0, _) => "0 ..." //是第一个元素是0的元组
                case (y, 0) => "" + y + "0" // 匹配后一个元素是0的对偶元组
                case (a, b) => "" + a + " " + b
                case _ => "something else" //默认
            }
            println(result)
        }
    }
}
