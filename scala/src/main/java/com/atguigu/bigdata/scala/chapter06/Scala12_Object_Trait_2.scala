package com.atguigu.bigdata.scala.chapter06

object Scala12_Object_Trait_2 {

    def main(args: Array[String]): Unit = {

        // OCP => OpenClose原则
        // 动态混入
        val user = new User() with Update
        user.insertUser()
        user.updateUser()
    }
    trait Update {
        def updateUser(): Unit = {
            println("user update...")
        }
    }
//    class Parent {
//        def updateUser(): Unit = {
//            println("user update...")
//        }
//    }
    class User {
        def insertUser(): Unit = {
            println("user insert...")
        }
//        def updateUser(): Unit = {
//            println("user update...")
//        }
    }
//    class Child extends User {
//        def updateUser(): Unit = {
//            println("user update...")
//        }
//    }
}