package com.atguigu.bigdata.scala.chapter06

object Scala09_Object_Abstract_1 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 抽象
        // 抽象属性
        val c = new Child
        c.test()




    }
    // 如果一个类中含有抽象属性，那么这个类应该为抽象类
    abstract class User {
        // TODO 声明属性而没有初始化，称之为抽象属性
        // scala中声明属性，其实也同时声明了方法
        // 抽象属性在编译时没有属性的，有的只是抽象的属性set，get方法
        // 重写抽象属性，只要补充完整即可
        // 重写完整属性，那么属性需要增加override关键字
        var name : String
        val age : Int = 10

        def test(): Unit = {
            //age = 30 // setage(30)
            println(age) // getage()
        }
    }
    class Child extends User {
        var name : String = "zhangsan"
        override val age : Int = 20
    }
}