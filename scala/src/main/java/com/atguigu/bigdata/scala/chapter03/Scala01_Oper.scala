package com.atguigu.bigdata.scala.chapter03

object Scala01_Oper {

    def main(args: Array[String]): Unit = {

        // TODO 运算符
        // 马丁想：比较对象最直观地操作就应该是双等号，但是又不应该比较内存地址
        //       所以双等号的运算符被重写 : 非空equals
        //       如果想要比较内存地址，必须使用特殊操作 eq
        val s1: String = new String("abc")
        //val s1: String = null
        val s2: String = new String("abc")
        System.out.println(s1 == s2)
        System.out.println(s1.equals(s2))
        System.out.println(s1 eq s2)

        1
        new Object()

    }
}
