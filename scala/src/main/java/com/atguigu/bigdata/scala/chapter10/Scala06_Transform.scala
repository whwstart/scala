package com.atguigu.bigdata.scala.chapter10

object Scala06_Transform {

    def main(args: Array[String]): Unit = {

        // 隐式函数
//        implicit def transform( user : User ): UserExt = {
//            new UserExt(user)
//        }

        val user = new User()
        user.insertUser()
        user.updateUser()

    }

    // 隐式类
    // 主构造函数中只能有一个参数
    implicit class UserExt(user:User) {
        def updateUser(): Unit = {
            println("update user..." + user.name)
        }
    }
    class User {
        val name = "zhangsan"
        def insertUser(): Unit = {
            println("insert user..." + name)
        }
    }
}
