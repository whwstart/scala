package com.atguigu.bigdata.scala.chapter04

object Scala04_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 运算符
//        val s = "hello"
//        for (c <- s) {
//            println(c)
//        }

//        for ( i <- Range(1,5) if i != 3  ) {
//            println("i = " + i )
//        }
//        println("=========================")
//        for ( i <- Range(1,5)   ) {
//            if (i != 3) {
//                println("i = " + i )
//            }
//        }

//        for ( i <- 11 to 1 by -1 ) {
//            println(i)
//        }

//        for ( i <- Range(1,5); j <- Range(1,4) ) {
//
//            println("i = " + i + ",j = " + j )
//        }
//
//        for ( i <- Range(1,5) ) { // i = 3
//            for ( j <- Range(1,4) ) {
//                println("i = " + i + ",j = " + j )
//            }
//        }

//        for ( i <- Range(1,5); j = i - 1 ) {
//            println("j = " + j )
//        }

//        for ( i <- 1 to 18 by 2; j = (18 - i)/2 ) {
//            println(" " * j + "*" * i)
//        }

        val result = for ( i <- 1 to 4 ) yield {
            i * 2
        }

        // ()
        // for循环的默认返回值为Unit
        println(result)
    }
}
