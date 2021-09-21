package com.atguigu.bigdata.scala.chapter05

object Scala09_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 柯里化
        // 将无关的参数放置在一个参数列表中
        // 所谓的柯里化就是将无关的参数给分离开，形成多个参数列表
        // 这样有的参数列表可以根据场景省略
        val i = getI() // 5min
        val j = getJ() // 10min
        test(i)(j)

    }
    def test( i: Int)(j : Int ): Unit = {
        for ( a <- 1 to i ) {  // 5min
            println(a)
        }
        for ( a <- 1 to j ) { // 10min
            println(a)
        }
    }
    def getI() = {
        5 // 5min
    }
    def getJ()  = {
        10 // 10min
    }



}
