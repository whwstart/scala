package com.atguigu.bigdata.scala.chapter06

object Scala08_Object_Instance {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - Class - 构造方法

        // scala是一门完全面向对象的语言 ： 万物皆对象
        // scala是一门完全面向函数的语言 ：万物皆函数, 类其实就是函数, 在类名后面可以增加小括号
        val user = new User("lisi")
        //val user1 = new User

    }
    // 创建一个类，jvm会自动提供公共，无参的构造方法
    // 如果自定义公共，无参的构造方法，jvm就不再提供
    // scala中构造方法和java不一样，名字不一样,构造方法的名字使用this
    class User(name:String) {
        // 构造方法体
        // 类的主体

        // 类的初始化
        //val name = "zhangsan"
    }
}