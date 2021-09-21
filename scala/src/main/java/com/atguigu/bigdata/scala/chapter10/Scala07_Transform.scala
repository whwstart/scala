package com.atguigu.bigdata.scala.chapter10

import com.atguigu.bigdata.scala.chapter10.Scala07_Transform.User

object Scala07_Transform extends MyTrait {

    def main(args: Array[String]): Unit = {

        // TODO 隐式转换的作用域范围
        // 1. 当前代码的作用范围
        // 2. 隐式关键字不能 修饰顶级类和对象
        // 3. 父类 & 父类的伴生对象
        // 4. 特质 & 特质的伴生对象
        // 5. 包对象

        // 推荐用法： 哪里都不放。随便写个地方，使用的时候导入进来即可
        import com.atguigu.bigdata.scala.bean.Transform._
        import scala.Predef._
        val user = new User()
        user.insertUser()
        user.updateUser()

    }

    // 隐式类
    // 主构造函数中只能有一个参数
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user..." + user.name)
//        }
//    }
    class User {
        val name = "zhangsan"
        def insertUser(): Unit = {
            println("insert user..." + name)
        }
    }
}

class Parent {
    //    implicit class UserExt(user:User) {
    //        def updateUser(): Unit = {
    //            println("update user..." + user.name)
    //        }
    //    }
}

object Parent {
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user..." + user.name)
//        }
//    }
}
trait MyTrait {
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user..." + user.name)
//        }
//    }
}
object MyTrait {
//    implicit class UserExt(user:User) {
//        def updateUser(): Unit = {
//            println("update user..." + user.name)
//        }
//    }
}