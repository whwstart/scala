package com.atguigu.bigdata.scala.chapter06
object Scala01_Object {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程
        // Scala中的面向对象编程和Java中的面向对象编程没有本质上的区别
        /*
        package xxxx.yyyy.zzz;
        import java.util.*;
        public class User {
            private String name;
            public void setName(String name) {
               this.name = name;
            }
        }

        User user = new User();
        user.setName("zhangsan");
         */
        val user : User = new User()
        user.name
        user.test()
    }
}
class User {
    // 属性 - 类中变量
    var name : String = "zhangsan"
    // 方法 - 类中的函数
    def test(): Unit = {

    }
}
