package com.atguigu.bigdata.scala.chapter06

object Scala03_Object_Import_2 {

    def main(args: Array[String]): Unit = {

        val name = "lisi"
        // TODO 面向对象编程
        // scala语法中允许导入对象中的所有内容，但是对象的引用变量必须使用val修饰
        val user = new User()
        import user._
        println(name)
        test()

    }
    class User {
        var name : String = "zhangsan"
        def test(): Unit = {

        }
    }
}
