package com.atguigu.bigdata.scala.test

/*

package : 和java一样，是包的概念
object : 声明对象的关键字
Scala02_HelloScala : 声明的对象名，对象类型为： Scala02_HelloScala$
main : 方法名
def : 声明方法（函数）关键字
() : 参数列表

args: Array[String] => 参数

    马丁想：绝大部分的代码都是在使用对象，而不是使用类型，类型声明基本上只使用一次
          java是一个强类型的语言：运行前必须明确所有的类型
          类型只声明一次，而对象多次使用，所以对象名称更重要，所以在声明时，应该名称在前，类型在后

          java  => 参数类型 参数名
          scala => 参数名 : 参数类型

Array[String] : 数组 String[] => [] 不是面向对象的语法

          scala语言是一个完全面向对象的语言，所以数组在scala中有专门的类型
          []表示泛型

: Unit

        java  => 方法返回值类型  方法名（参数列表）
        scala => 方法名（参数列表） : 方法返回值类型

        Unit
        java : 没有返回值使用void, void->String->Integer
        scala : 没有返回值本身也是返回值，也应该有自己的类型，Unit

= : 赋值， 将方法体（对象）赋值给方法名（变量），

{}

System.out.println => Scala语言是基于Java语言开发的，Java的基本语法可以在scala中直接使用

分号结尾：Java中必须使用分号结尾,scala中不需要分号结尾
        scala可以使用换行符作为逻辑分隔符,但是如果一行中有多个逻辑代码，那么每一个逻辑代码需要使用分号
 */
object Scala02_HelloScala {

    def main(args: Array[String]): Unit = {
        System.out.println("Hello Scala")
        println("Hello World")
    }
}
