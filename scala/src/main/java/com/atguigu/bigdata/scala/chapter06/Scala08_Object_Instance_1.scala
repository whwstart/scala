package com.atguigu.bigdata.scala.chapter06

object Scala08_Object_Instance_1 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - Class - 构造方法

       // 定义多个构造方法
        // TODO SCALA中构造方法分为2大类
        // 1. 完成类的初始化 : 主构造方法
        // 2. 辅助操作，将外部的操作传递到内部 ： 辅助构造方法, 用this关键字声明的构造方法
        //    辅助构造方法必须要首先完成类的初始化操作，然后在进行辅助操作。所以必须在代码中首先调用主构造方法
        //    辅助构造方法之间可以互相调用,调用前必须声明过
        val user1 = new User("lisi")
        val user2 = new User(20)

    }

    class User(name:String) {
        def this() {
            this("zhangsan")
        }
        def this(age:Int) {
            this()
        }
    }
}