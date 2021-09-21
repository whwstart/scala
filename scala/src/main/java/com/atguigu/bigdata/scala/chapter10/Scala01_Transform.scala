package com.atguigu.bigdata.scala.chapter10

object Scala01_Transform {

    def main(args: Array[String]): Unit = {

        // TODO 1. 问题： 下面的代码怎么理解?
//        val b : Byte = 10
//        val i : Int = b
//       // val b1 : Byte = i
//        println(i)
        // TODO 2. 问题： 字符串怎么就当成数组来看?
        val s = "zhangsan"
        println(s(1))

        //Range(1,2,1) => Range.apply(1,2,1)
        // object由apply方法，class类也有apply方法
        // object中的apply方法使用对象名直接访问
        // class中的apply方法也是使用对象名访问
        println(s.apply(1))
        s.charAt(1)

        //val flatten: List[Char] = List("abc").flatten
        // TODO 3. 扩展功能时，违背OCP开发原则
        //val age : Int = thirdPartOperation()
        //println(age)

    }

    def thirdPartOperation(): Double = {
        30.5
    }
}
