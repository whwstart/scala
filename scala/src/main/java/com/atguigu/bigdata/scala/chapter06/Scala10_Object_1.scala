package com.atguigu.bigdata.scala.chapter06

object Scala10_Object_1 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 单例对象

        // object作用用于声明对象（单例）
        // scala是一个完全面向对象的语言，没有静态语法的，但是想模拟静态操作怎么办？
        // 这个时候，就使用object关键字模拟静态语法
        // 使用object关键字声明类时，会同时编译出2个类，一个就是当前类本身，
        // 还有一个就是单例对象的类：当前类$

        // object对象的类伴随着本身的类编译出来的，object对象就称之为伴生对象
        // 这个本身的类就称之伴生类

        // 一般会将成员方法和属性声明在伴生类中，
        // 一般会将模拟的静态方法和静态属性声明在伴生对象中
        new User().fun()
    }
    // 伴生类
    class User {
       def fun(): Unit = {

       }
    }
    // 伴生对象
    object User {
        def test(): Unit = {

        }
    }
}