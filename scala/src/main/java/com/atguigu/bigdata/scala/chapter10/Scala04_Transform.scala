package com.atguigu.bigdata.scala.chapter10

object Scala04_Transform {

    def main(args: Array[String]): Unit = {

        // TODO 在同一个作用域中，相同的隐式转换规则不能有多个。
        implicit def transform( i : Int ): Byte = {
            i.toByte
        }

//        implicit def transform1( i : Int ): Byte = {
//            i.toByte
//        }

        val i : Int = 10
        val b : Byte = i
        println(b)

    }

}
