package com.atguigu.bigdata.scala.chapter04

object Scala03_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 运算符

        // 循环
        /*
        for ( int i = 0; i < 10; i=i+2 ) {
            sout(i)
        }

        for ( Object obj : list ) {
           sout(obj)
        }
         */

        val list = 1 to 5 // 1,2,3,4,5
        //val list = 1 until 5 // 1,2,3,4,5
        val list1 = Range(1,5)
        val list2 = 1 to 5 by 2 // 1,2,3,4,5
        val list3 = Range(1,5,2)
//        for ( num : Int <- list ) {
//            println(num)
//        }
        for ( num <- list3 ) {
            println(num)
        }
    }
}
