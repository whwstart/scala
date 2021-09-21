package com.atguigu.bigdata.scala.chapter05

object Scala01_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程
        // 1. 什么是函数？
        //    逻辑代码封装
        // 2. 什么是方法？
        //    逻辑代码封装

        // 如何区分函数和方法？
        //   方法体现用户的行为
        //   函数和对象没有任何关系，仅仅是功能封装

        // 函数的声明方式和方法是一致的
        // def 方法名(参数列表):方法返回值类型 = { 方法体 }
        // def 函数名(参数列表):函数返回值类型 = { 函数体 }

        // 1. java中没有函数，可是scala中由函数，编译后的class文件怎么体现函数
        //    scala中函数在编译时也是编译为方法，只不过增加了修饰符：private final static
        //    编译为方法时会改变方法名
        // 2. 方法名和函数名重名了，怎么办？
        //    函数名会自动改变，调用时，会自动转换为改过名的函数

        def test(): Unit = {
            println("function....")
//            def test(): Unit = {
//                println("function11111111....")
//            }
        }

        test()

    }
    // 方法
    def test(): Unit = {
        println("method....")
    }

}
