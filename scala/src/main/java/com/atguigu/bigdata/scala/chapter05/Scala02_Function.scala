package com.atguigu.bigdata.scala.chapter05

object Scala02_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程
        // 函数的声明和使用
        // scala语言不关系函数的实现方式，只关心如何调用
        // 函数如何声明（I(参数)O（返回值））
        // 函数调用： 函数名（传参）

        // TODO 1. 无参，无返回值
        def fun1(): Unit = {
            println("fun1...")
        }

        // 代码块会直接代码
//        {
//            println("fun2...")
//        }

        //1 + 1 // 1 + 1
        //fun1()
        // 调用无参的函数的时候，小括号可以省略的
        //fun1

        // TODO 2. 无参，有返回值
        def fun2(): String = {
            return "zhangsan"
        }

        val str: String = fun2()
        val str1: String = fun2
        //println(str1)

        // TODO 3. 有参，无返回值
        def fun3( s:String ): Unit = {
            println(s)
        }

        //fun3("zhangsan") // 有参的函数调用，必须传递参数
        //fun3 "zhangsan" // 函数的参数如果只有一个，也不能省略小括号
        //fun3(null)

        // TODO 4. 有参，有返回值
        def fun4( name:String ): String = {
            return "Name :" + name
        }

        //val zhangsan: String = fun4("zhangsan")
        //println(zhangsan)

        // TODO 5. 多参，无返回值
        def fun5( name:String, age:Int ): Unit = {
            println(s"Name:${name}, Age:${age}")
        }

        //fun5("zhangsan") // 多参的场合，传值时，应该匹配参数的数量
        //fun5(1, "zhangsan")// 传参时，还要考虑类型和顺序
        //fun5("zhangsan", 1)

        // TODO 6. 多参，有返回值
        def fun6( name:String, age:Int  ): String = {
            val json =
                s"""
                  | { "name":"${name}", "age":${age}}
                  |""".stripMargin
              return json
        }

        val json = fun6("zhangsan", 10)
        println(json)


    }

}
