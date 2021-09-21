package com.atguigu.bigdata.scala.chapter06

object Scala12_Object_Trait {

    def main(args: Array[String]): Unit = {

        // TODO 特质
        // 将多个对象中相同的特征剥离出来，形成一个独立的语法结构，称之为特质（特征）
        // 如果一个类符合这个特征，那么可以将这个特征混入到这个类中

        // 如果一个类有多个特征，完全可以让一个混入多个特征 with
        // 一个类如果混入了多个特征，那么第一个特征使用extends关键字，后面的都使用with关键字
        // 如果一个类既有父类，同时还混入了特征，那么父类使用extends关键字，特征的混入采用with

        // trait编译后其实就是interface

    }
    trait Test {

    }
    trait Runnable {
        def run()
    }
    class XXX {

    }
    class Person extends XXX with Runnable with Test {
        override def run(): Unit = {
            println("person run...")
        }
    }
    class Cat extends Runnable {
        override def run(): Unit = {
            println("cat run...")
        }
    }
}