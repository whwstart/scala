package com.atguigu.bigdata.scala.chapter09

object Scala01_Exception {
    def main(args: Array[String]): Unit = {

        // Scala中没有异常的分类
        // Scala中的异常如果需要提示java代码中做处理，那么需要增加注解
        try {
            val i = 0
            val j = 10 / i
        } catch {
            case e:ArithmeticException => println("除数为0的异常")
            case e:Exception => e.printStackTrace()
        }
    }
    @throws[Exception]
    def test() = {
        throw new Exception()
    }

}
