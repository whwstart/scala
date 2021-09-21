package com.atguigu.bigdata.scala.chapter05

object Scala10_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 递归
        // 1. 方法自己调用自己
        // 2. 递归方法需要有跳出逻辑，因为可能会出现栈溢出(StackOverflowError)
        // 3. 递归过程中的参数传递时应该有规律
        // 4. 递归函数中返回值类型必须确定，不能省略

        // 栈溢出
        // 10G => 10 * 1024m =>(5M)
        // 栈内存溢出（一个线程JVM会分配一个栈内存（5M）(1K)=> 5* 1024）
        // 堆内存溢出（Full GC）
        // 方法区内存溢出

        // 能省则省
        println(test(10000000))

    }
    def test( num : Int ):Int = {
        if ( num <= 1 ) {
            1
        } else {
            num + test(num-1)
        }
    }

}
