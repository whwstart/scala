package com.atguigu.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala05_Object_Class_Field_1 {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - Class - Field(属性)
        // scala中所谓类的属性起始就是类中声明的变量
        //      但是作用域不一样
        // scala中变量必须显示初始化,但是如果想要达成和java的属性初始化一样的效果,可以采用下划线
        // val声明的属性不能使用下划线初始化。

        // TODO scala给类声明属性，在编译后，这个属性是私有的。但是同时编译出了2个公共的方法,用于set,get属性.
        val user = new User()
        //user.name = "lisi"
        //println(user.name)
        //user.setName("123")
        //user.getName()

        // Java中很多的框架要求bean对象必须符合bean规范(属性私有化，并提供set，get方法)
        // val声明的属性，那么在编译时不会生成对应的set方法
        // 增加@BeanProperty注解的属性，编译时会自动添加set,get方法，符合bean规范
    }
    class User {
        // 属性的初始化
        private val name : String = "zhangsan";
        //var age = 30
        //var email : String = _
        //@BeanProperty var name : String = _
    }
}