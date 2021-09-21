package com.atguigu.bigdata.scala.chapter06

object Scala06_Object_Access {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - 权限
        /*

         java 权限：
            1. private   => 同类
            2. (default) => 同包，同类
            3. protected => 同包，同类，子类
            4. public    => 公共的
         scala 权限
            1. private        => 同类
            2. private[包名]   => 同类，同包(子包)
            3. protected      => 同类，子类
            4. (public)       => 公共
         */


    }
    // 同包
    class Emp {
        def test(): Unit = {
            val user = new User()
            //println(user.name)
            println(user.email)
            //println(user.age)
            println(user.password)
        }
    }
    class User {
        private var name:String = "zhangsan"
        private[chapter06] var email:String = "zhangsan"
        protected var age:String = "zhangsan"
        var password:String = "zhangsan"

        def test(): Unit = {
            println(name)
            println(email)
            println(age)
            println(password)
        }
    }
}
package childPackage {

    import com.atguigu.bigdata.scala.chapter06.Scala06_Object_Access.User

    // 不同包
    class Emp {
        def test(): Unit = {
            val user = new User()
            //println(user.name)
            println(user.email)
            //println(user.age)
            println(user.password)
        }
    }
}
class A1 {

}
class A2 {
    
}