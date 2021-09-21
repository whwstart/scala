package com.atguigu.bigdata.scala.chapter05

object Scala04_Function_NightMare {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程 - 噩梦版
        // 马丁想：如何能够让程序员可以愉悦地开发代码
        //       如果能将代码简化成几句话或几行代码就可以解决问题。
        //       TODO 至简原则：能简单则简单，能简化则简化，能省则省(马丁认识)
//        def test( ): String = {
//            return "zhangsan"
//        }
//
//        println(test())

        // TODO 1. scala中所有表达式都有结果,那么无需明确使用return操作
        //         return关键字可以省略
//        def test( ): String = {
//            val age = 30
//            if ( age == 30 ) {
//                "zhangsan"
//            } else {
//                "lisi"
//            }
//        }
//        println(test())

        // TODO 2. 如果函数体的逻辑代码只有一行，省略大括号
        //def test( ): String = "zhangsan"

        // TODO 3. 如果通过返回结果能确定类型，那么返回值类型可以省略
        //def test( ) = "zhangsan"

        // TODO 4. 如果参数列表中没有声明任何的参数，那么参数列表的小括号可以省略
        //def test = "zhangsan"
        //val name = "lisi"
        // 访问一致性
        //println(name)
        //println(test)
        //println(test())// TODO 如果函数声明时没有声明参数列表，那么调用时不能增加小括号

        // TODO 5.
        //         如果函数明确声明Unit，那么函数体中的return关键字不起作用，无法返回值
        //         如果函数体中使用return返回结果，那么返回值类型必须声明
        //         如果希望即使省略Unit，return关键字也不起作用，可以省略Unit的同时省略等号
        //         将这样的函数称之为过程函数,它的结果不会影响别人
//        def test()  {
//            return "zhangsan"
//        }
        //        println(test())

        // TODO 6. 如果名称不重要的时候，关键字和名称就可以省略
        //         名称和关键字可以省略，返回值类型要同时省略，需要将等号进行转换成箭头
        //         将没有名称和关键字的函数称之为 匿名函数
//        val f = () => {
//            println("zhangsan")
//        }

        // 变量有类型，如果将函数赋值给一个变量，那么这个变量的类型就是函数类型
        // scala中函数是有专门的类型,这个类型中最大的参数个数为22
        // scala中函数可以可以简化 ： In => Out
        //val ff : Function22
//        val ff : Function0[Unit] = _
//        val ff : Function1[String, Unit] = _

        // TODO 将函数作为一个对象赋值给一个变量
        def fun(): Unit = {
            println("lisi")
        }
//        val ff : ()=>Unit = fun
//
//        ff()

        val ff : ()=>Unit = ()=>{
            println("test....")
        }

        ff()




    }


}
