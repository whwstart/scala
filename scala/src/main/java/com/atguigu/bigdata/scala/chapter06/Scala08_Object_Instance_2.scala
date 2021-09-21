package com.atguigu.bigdata.scala.chapter06

object Scala08_Object_Instance_2 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - Class - 构造方法

        // 1. 执行顺写
        // 2. 构造参数的问题
        // 3. 父类的构造方法

        //val user2 = new User(20)
        // 111
        // 4444
        // 222
        // 333

        val user = new User("zhangsan")

        // 构造方法的参数和类的属性没有任何关系
        // 将构造方法声明参数的主要目的是为了给属性赋值，scala中可以将构造参数直接作为属性来用
        // 采用var或val声明

    }
    class User( val name:String ) {
    }

//    class User(name:String) {
//        println("111")
//        def this() {
//            this("zhangsan")
//            println("222")
//        }
//        def this(age:Int) {
//            this()
//            println("333")
//        }
//        println("4444")
//    }
}