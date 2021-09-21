package com.atguigu.bigdata.scala.bean

object Transform {
    implicit class UserExt(user:com.atguigu.bigdata.scala.chapter10.Scala07_Transform.User) {
        def updateUser(): Unit = {
            println("update user..." + user.name)
        }
    }
}
