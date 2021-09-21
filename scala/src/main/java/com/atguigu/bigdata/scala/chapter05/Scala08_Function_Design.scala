package com.atguigu.bigdata.scala.chapter05

object Scala08_Function_Design {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 控制抽象
        def operationDB ( op : => Unit ): Unit = {
            println("init connection...")

            op

            println("close connection...")
        }

        operationDB {
            println("operation db...")
        }

    }


}
