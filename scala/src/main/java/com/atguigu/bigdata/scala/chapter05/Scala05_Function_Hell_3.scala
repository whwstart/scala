package com.atguigu.bigdata.scala.chapter05

object Scala05_Function_Hell_3 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 地狱版

        /*
          public User test() {
              return new User();
          }
         */
        // TODO 将一个函数作为返回值使用
//        def test(): Unit = {
//            println("test...")
//        }
//        def fun()  = {
//            test _
//        }
//
//        val f = fun()
//
//        println(f())
//        def outer() = {
//            def inner(): Unit = {
//                println("inner...")
//            }
//            inner _
//        }

//        val inner = outer()
//        inner()
//        outer()()

        def outer( a : Int ) = {
            def mid( b : Int ) = {
                def inner( f : (Int, Int)=>Int ):Int = {
                    f(a, b)
                }
                inner _
            }
            mid _
        }

        //println(outer(10)(20)((x: Int, y: Int) => {x + y}))
        //println(outer(10)(20)((x: Int, y: Int) => x + y))
        //println(outer(10)(20)((x, y) => x + y))
        println(outer(10)(20)(_ + _))

    }


}
