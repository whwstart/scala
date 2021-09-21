package com.atguigu.bigdata.scala.chapter04

object Scala01_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 运算符
        // 分支控制 - 单分支
        val age = 40
//        if ( age == 20 ) {
//            println("年龄为20")
//        }
//        println("XXXX")

        // 分支控制 - 双分支
//        if ( age == 20 ) {
//            println("年龄为20")
//        } else {
//            println("XXXX")
//        }
        // 分支控制 - 多分支
        if ( age < 18 ) {
            println("少年")
        } else if ( age < 28 ) {
            println("青年")
        } else if (  age < 45 ) {
            println("壮年")
        } else if ( age < 55 ) {
            println("中年")
        } else {
            println("老年")
        }

    }
}
