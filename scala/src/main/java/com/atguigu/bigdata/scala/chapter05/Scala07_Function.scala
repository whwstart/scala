package com.atguigu.bigdata.scala.chapter05

import scala.util.control.Breaks

object Scala07_Function {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 控制抽象
        // 抽象就是不完整
        // 如果参数为函数对象的话，那么声明类型时如果省略了参数列表，那么说明这个函数不完整
        // 调用时，就不能增加参数列表的小括号
        def test( f : => Unit ): Unit = {
            f
        }

        // 如果参数说明不完整，那么传递参数也不完整，TODO 只要传递逻辑代码即可
        // 如果传递的参数为多行逻辑代码，那么一般会讲小括号变成大括号
//        test {
//            for (i <- 1 to 5) {
//                println(i)
//            }
//        }
//        } catch() {
//
//        }

//        try {
//            for (i <- 1 to 5) {
//                println(i)
//            }
//        } catch
//        Breaks.breakable {
//            for ( i <- 1 to 5 ) {
//                if ( i == 3 ) {
//                    Breaks.break()
//                }
//                println("i = " + i)
//            }
//        }
//
//        println("xxxxx")

//        while ( cond() ) {
//            // 循环体
//
//        }

    }


}
