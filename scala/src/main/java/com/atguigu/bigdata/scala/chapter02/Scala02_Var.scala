package com.atguigu.bigdata.scala.chapter02

object Scala02_Var {

    def main(args: Array[String]): Unit = {

        // TODO 变量
        // 声明变量 =>  var | val 变量名：变量类型 = 变量值
        //   var name : String = "zhangsan"

        // 在使用变量时，一旦声明，修改的场景是比较少的。所以为了避免出现错误，增加了一个新的关键字val声明变量
        var name : String = "zhangsan"
        name = "wangwu"

        val name1 : String = "lisi"
        //name1 = "wangwu"


    }
}
