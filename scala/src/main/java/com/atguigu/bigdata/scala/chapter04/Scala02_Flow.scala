package com.atguigu.bigdata.scala.chapter04

object Scala02_Flow {

    def main(args: Array[String]): Unit = {

        // TODO 运算符
        // 分支控制 - 单分支
        val age = 40

        // 表达式的结果取值为：满足条件的逻辑的最后一行代码的执行结果
        val result = if ( age == 40 ) {
            //println("zhangsan")
            //1
            //"abc"
            null
        } else {
            "abc"
        }
        // "abc", Unit
        // 1 => Int
        // "abc" => String

        println(result)
    }
}
