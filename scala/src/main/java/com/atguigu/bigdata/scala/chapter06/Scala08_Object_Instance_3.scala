package com.atguigu.bigdata.scala.chapter06

object Scala08_Object_Instance_3 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - Class - 构造方法

        // 1. 执行顺写
        // 2. 构造参数的问题
        // 3. 父类的构造方法
        new User("lisi")

        // 111
        // 222
        // 333
        // 555
    }
    class Parent( val name:String ) {
        println("111")
        def this() {
            this("zhangsan")
            println("222")
        }
    }

    class User(name:String) extends Parent {
        println("333")
        def this() {
            this("zhangsan")
            println("444")
        }
        println("555")
    }
}