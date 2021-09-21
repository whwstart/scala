package com.atguigu.bigdata.scala.chapter05

object Scala11_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 递归
        // scala对尾递归代码进行了优化，编译为while(true)循环
        // java有尾递归，没有优化
        // 尾递归代码一定会出现问题，只是比普通的递归出现的时机晚
        test1()

    }
    // 普通递归
    def test() : Unit = {
        test()
        println("abc")
    }
    // 尾递归 -> 伪递归
    def test1() : Unit = {
        println("abc")
        test1()
    }

}
