package com.atguigu.bigdata.scala.chapter04

object Scala05_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 运算符
        // while不推荐使用

        var cnt = -1
//
//        while ( cnt > 0 ) {
//            println(cnt)
//            cnt = cnt - 1
//        }

        // 耦合性

        do {
            println(cnt)
            cnt = cnt - 1
        } while ( cnt > 0  )
    }
}
