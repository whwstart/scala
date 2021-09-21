package com.atguigu.bigdata.scala.chapter05

object Scala05_Function_Hell_1 {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 地狱版

        /*
          public void test( User user ) {

          }

          User user = new User();
          test(user)

         */
        // 将一个对象作为参数传递给一个方法
        // TODO 将一个函数作为参数传递给一个函数
//        def fun1(): Unit = {
//            println("abc")
//        }
//        // 参数名 ： 参数类型
//        def fun2( f : ()=>Unit ): Unit = {
//            f()
//        }
//
//        fun2(fun1)
        // 将一个函数作为参数传递到另外一个函数中
        // 这个函数有2个Int参数,返回结果也是Int
//        def fun( f : (Int, Int)=>Int ): Unit = {
//            val r = f(10, 20)
//            println(r)
//        }
//
//        def a( a:Int, b:Int ): Int = {
//            a + b
//        }
//        def b( a:Int, b:Int ): Int = {
//            a - b
//        }
//        def c( a:Int, b:Int ): Int = {
//            a * b
//        }

        // TODO 1. 使用函数作为参数，会感觉不方便
        //fun(multi)
        // TODO 2. 将函数作为参数使用时，函数名称没有那么重要，既然不重要，那么可以使用匿名函数
//        fun(
//            ( a:Int, b:Int ) => {
//                a * b
//            }
//        )
//        fun(
//            ( a:Int, b:Int ) => {
//                a - b
//            }
//        )
        // TODO 3. 匿名函数也遵循至简原则
        //fun(( a:Int, b:Int ) => {a - b})
        // TODO 3.1 如果函数逻辑代码只有一行，大括号可以省略
        //fun(( a:Int, b:Int ) => a - b)
        // TODO 3.2 如果参数类型可以推断出来，那么参数类型可以省略
        //fun(( a, b ) => a - b)
        // TODO 3.3 如果参数按照顺序只访问一次，那么可以使用下划线代替参数使用，那么参数可以省略
        //fun(_ + _)

        def test( f : (String)=>Unit ): Unit = {
            f("zhangsan")
        }

        def fun( s : String ): Unit = {
            println(s)
        }

        //test(fun)
//        test(
//            ( s : String ) => {
//                println(s)
//            }
//        )
//
//        test(
//            ( s : String ) => println(s)
//        )
//
//        test(
//            ( s ) => println(s)
//        )
        // TODO 3.4 如果参数只有一个的场合，那么小括号可以省略
//        test(
//            s => println(s)
//        )

        //test( println(_) )
        // 下面的代码不是至简原则
        test( println )
        test( fun     )


    }


}
