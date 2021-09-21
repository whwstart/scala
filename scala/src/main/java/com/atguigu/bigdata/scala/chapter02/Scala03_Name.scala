package com.atguigu.bigdata.scala.chapter02

object Scala03_Name {

    def main(args: Array[String]): Unit = {

        // TODO 标识符
        // scala中标识符分为2部分
        // 1. 普通起名和java一样
        //val name = "zhangsan"
        //val name1 = "zhangsan"
        //val name1$ = "zhangsan"
        //val name1_$ = "zhangsan"
        ////val 1name1_$ = "zhangsan" (X)
        ////val private = "zhangsan" (X)
        //val Private = "zhangsan"
        //val $$ = "zhangsan"
        //val __ = "lisi"
        //println(__)

        // 2. java中，+运算符，用于数值的计算，但是可以在字符串中进行拼接操作
        //    scala中的运算符都可以自己起名
        //    不要记
//        val + = "zhangsan"
//        val - = "zhangsan"
//        val * = "zhangsan"
//        val / = "zhangsan"
//        val % = "zhangsan"
//        val ~ = "zhangsan"
//        val `` = "zhangsan"
//        val ! = "zhangsan"
//        val @@ = "zhangsan"
//        val ## = "zhangsan"
//        val ^ = "zhangsan"
//        val & = "zhangsan"
//        val > = "zhangsan"
//        val < = "zhangsan"
//        //val : = "zhangsan"
//        val :: = "zhangsan"
//        val ::: = "zhangsan"
        // 颜文字
        // $colon$minus$greater
//        val $colon$minus$greater = "lisi"
//        val :-> : String = "zhangsan"
//        println(:->)
        val `private` : String = "private"

        Thread.`yield`()



    }
}
