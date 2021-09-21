package com.atguigu.bigdata.scala.chapter06

object Scala09_Object_Abstract {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 抽象
        // 抽象类， 抽象方法
        val user : User = new Child()
        user.test1()



    }
    // 如果一个类中有抽线方法，那么这个类应该声明为抽象类
    // 抽象类无法直接构建对象
    abstract class Test {

    }
    abstract class User {

        // TODO 抽象方法：只有声明，没有实现
        //      scala中无需使用abstract关键字
        def test():Unit

        // 完整方法
        def test1(): Unit = {
            println("user teset1...")
        }
    }
    class Child extends User {
        // 将抽象方法补充完整，类就不需要声明为抽象的
        def test(): Unit = {

        }
        // 完整方法的重写需要增加关键字override
        override def test1(): Unit = {
            println("child teset1...")
        }
    }
}