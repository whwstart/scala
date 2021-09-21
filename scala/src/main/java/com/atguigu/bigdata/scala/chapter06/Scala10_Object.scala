package com.atguigu.bigdata.scala.chapter06

object Scala10_Object {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 单例对象
        /*
           java : 单例模式
           1. 构造方法私有化
           2. 公共，静态的，返回本类型的方法 ： new
           3. 对象的内部创建

           scala
           1. 构造方法私有
              类名的后面增加private关键字
           2. scala中没有静态的概念

           3. scala如果想要使用单例对象，直接在类的前面使用object关键字就行

           4. 只有最外层（Top-Level）的对象如果使用object声明，那么构造方法是私有的
         */
        //val user = new User()

//        println(User)
//        println(User)
//        println(User)

        User.test()
        println("xxxx")

        Scala10_Object.User.test()
    }
    object User {
        def test(): Unit = {
            println("test")
        }
    }
}