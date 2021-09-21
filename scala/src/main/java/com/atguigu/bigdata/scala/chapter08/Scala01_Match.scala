package com.atguigu.bigdata.scala.chapter08

object Scala01_Match {

    def main(args: Array[String]): Unit = {

        val age = 50

        // 模式匹配不存在穿透现象
        // 下划线表示前面所有的分支条件都不成立，任意值,一般放置在所有的分支的最后
        // scala.MatchError : 所有的分支都不成立，就会发生错误。
//        age match {
//            //case _  => println("other")
//            case 10 => println("10")
//            case 20 => println("20")
//            case 30 => println("30")
//
//        }

        var a: Int = 10
        var b: Int = 20
        var operator: Char = '*'
        var result = operator match {
            case '+' => a + b
            case '-' => a - b
            case '*' => a * b
            case '/' => a / b
            case _ => "illegal"
        }
        println(result)

    }
}
