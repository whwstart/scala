package com.atguigu.bigdata.scala.chapter10

object Scala02_Transform {

    def main(args: Array[String]): Unit = {

        // 马丁想：如果程序编译出现错误，那么在当前代码的作用域中可以查找到一个逻辑可以将这个错误解决
        //       那么实现二次编译，自动调用这段逻辑。这段逻辑的主要目的是转换类型实现需求。
        //       这个转换的过程由编译器完成，无需人工参与，称之为自动转换，也称之为隐式转换
        //       如果想让编译器可以使用转换规则，那么必须要增加标记，可以被编译器识别
        // TODO 隐式转换
        implicit def transform( d : Double ): Int = {
            d.toInt
        }

        val age : Int = thirdPartOperation()
        println(age)

    }

    def thirdPartOperation(): Double = {
        30.5
    }
}
