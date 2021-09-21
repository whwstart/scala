package com.atguigu.bigdata.scala.chapter05

object Scala05_Function_Hell {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 地狱版
        // Topic : 函数是一个对象
        def test(): Unit = {
            println("abc....")
        }
        def test1(s : String, i:Int): Unit = {

        }
        //test()
        //test
        // 声明一个函数，就等同于声明一个函数对象
        // User(函数类型) user = new User()（函数）
        // 下划线可以让函数不执行，当成对象来使用

        // 编译器在编译时，如果变量没有声明类型，会根据等号的右边的结果推断类型
        val f = test _
        // 函数类型： In=>Out
        // 如果函数类型中参数只有一个，小括号可以省略
        val ff : (String, Int)=>Unit = test1
        ff("zhangsan", 20)





    }


}
