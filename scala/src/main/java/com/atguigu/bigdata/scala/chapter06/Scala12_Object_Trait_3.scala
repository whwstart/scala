package com.atguigu.bigdata.scala.chapter06

object Scala12_Object_Trait_3 {

    def main(args: Array[String]): Unit = {

        //new User().test()
        // Java为什么不支持多继承？？

        // 如果类和特质同一个级别，那么特质先初始化
        // 如果多个特质混入操作，那么初始化顺序是从左到右
        // 初始化只会进行一次

        // parent
        // aaaa
        // bbbb
        // cccc
        // user

        // aaaa
        // bbbb
        // parent
        // cccc
        // user
    }
//    trait A {
//        println("aaaa")
//        def test(): Unit = {
//
//        }
//    }
//    trait B extends A {
//        println("bbbb")
//        override def test(): Unit = {
//
//        }
//    }
//    trait C {
//        println("cccc")
//        def test(): Unit = {
//
//        }
//    }
//    class Parent extends B {
//        println("parent")
//    }
//    class User extends Parent with A with B with C{
//        println("user")
//    }
}