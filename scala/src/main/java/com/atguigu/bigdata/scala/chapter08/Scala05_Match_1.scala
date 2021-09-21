package com.atguigu.bigdata.scala.chapter08

object Scala05_Match_1 {

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
    // 类的前面增加case关键字，表示样例类，专门用于模式匹配，匹配对象,当成普通类来用也可用
    //
    case class User(name : String,age : Int )


















    private def getUsers() = {
        User("zhangsan", 30)
    }
}
