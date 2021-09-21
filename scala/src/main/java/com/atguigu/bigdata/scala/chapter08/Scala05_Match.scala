package com.atguigu.bigdata.scala.chapter08

object Scala05_Match {

    def main(args: Array[String]): Unit = {
        // 模式匹配
        // User(1), User(1)
        // 匹配对象时一般都不会比较内存地址，而是比较内容（属性）
        // attr => apply => User
        // User => unapply => attr
        val user = getUsers()
        user match {
            case User("zhangsan", 40) => println("用户没问题")
            case _ => println("用户有问题")
        }
        
    }
    class User {
        var name : String = _
        var age : Int = _
    }
    object User {
        def apply(name:String, age:Int): User = {
            val user = new User()
            user.name = name
            user.age = age
            user
        }

        def unapply(arg: User): Option[(String, Int)] = {
            Option( (arg.name, arg.age) )
        }
    }
    private def getUsers() = {

        User("zhangsan", 30)
    }
}
