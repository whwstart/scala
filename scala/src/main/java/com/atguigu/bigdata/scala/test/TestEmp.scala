package com.atguigu.bigdata.scala.test

// 不同包，而且不存在父子包关系
object TestEmp {

    def main(args: Array[String]): Unit = {
//        val user = new com.atguigu.bigdata.scala.chapter06.Scala06_Object_Access.User()
//        println(user.name)
//        println(user.email)
//        println(user.age)
//        println(user.password)
    }
    class ChildUser extends com.atguigu.bigdata.scala.chapter06.Scala06_Object_Access.User {
        def test1(): Unit = {
//            println(name)
//            println(email)
//            println(age)
//            println(password)
        }
    }
}
