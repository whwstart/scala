package com.atguigu.bigdata.scala.chapter06

object Scala10_Object_2 {

    def main(args: Array[String]): Unit = {

        //new User()
        //val user1: User = User.apply()

        // TODO 伴生对象可以访问伴生类中的所有的内容。
        // TODO scala中为了方便构建对象，如果构建对象的方法名是一个特殊名称的话，那么这个方法名可以不用写
        // TODO apply方法可以重载
//        val user2: User = User()
//        val user3: User = User("zhangsan")
        //Range(1,5,2)

        println(User) // 单例对象 ： User$
        println(new User()) // 表示通过调用构造方法完成对象的构建
        println(User()) // 通过伴生对象的apply方法构建对象
    }
    // 伴生类
    class User {

    }
    // 伴生对象
    object User {
        def apply(): User = {
            new User()
        }
        def apply(name:String): User = {
            new User()
        }
    }
}