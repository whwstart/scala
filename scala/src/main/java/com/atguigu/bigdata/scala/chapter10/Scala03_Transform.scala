package com.atguigu.bigdata.scala.chapter10

object Scala03_Transform {

    def main(args: Array[String]): Unit = {

        // 遵循OCP开发原则
        // 隐式转换也称之为二次编译
        implicit def transform( user : User ): UserExt = {
            new UserExt
        }

        val user = new User() // with Update;
        user.insertUser()
        user.updateUser()

    }
    class UserExt {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
    trait Update {
        def updateUser(): Unit = {
            println("update user...")
        }
    }
    class User {
        def insertUser(): Unit = {
            println("insert user...")
        }
//        def updateUser(): Unit = {
//            println("update user...")
//        }
    }
//    def getUser() = {
//        new User()
//    }
}
