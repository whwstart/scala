package com.atguigu.bigdata.scala.chapter06

object Scala07_Object_Class_Method {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - Class - Method(方法)
        // 所谓的方法其实就是函数,只不过声明在类中，遵循类的约束和要求
        val user = new User()
        //user.test()
        // eq方法可以直接使用，比较内存地址
        //user.eq()
        // isInstanceOf方法可以直接使用，表示当前对象是否为某一个类型的实例
        user.isInstanceOf[Object]
        // asInstanceOf方法可以直接使用，表示当前对象做为某一个类型的实例来使用
        user.asInstanceOf[Object]

    }
    class User {
        def test(): Unit = {

        }
    }
}