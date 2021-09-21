package com.atguigu.bigdata.scala.chapter06

object Scala05_Object_Class_Field {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - Class - Field(属性)
        // scala中所谓类的属性起始就是类中声明的变量
        //      但是作用域不一样
        // scala中变量必须显示初始化,但是如果想要达成和java的属性初始化一样的效果,可以采用下划线
        // val声明的属性不能使用下划线初始化。

        // TODO scala给类声明属性，在编译后，这个属性是私有的。但是同时编译出了2个公共的方法,用于set,get属性.
        val user = new User()
        //user.name = "lisi"
        //user.age = 40
        // 给类的属性赋值的场合，并不是给这个属性赋值，而是访问这个属性的set方法进行赋值
        user.name = "lisi"
        // 访问类的属性，起始并不是访问这个属性，而是访问这个属性的get方法
        println(user.name)
    }
    class User {
        // 属性的初始化
        //val name : String = _;
        //var age = 30
        //var email : String = _
        var name : String = _
    }
}