package com.atguigu.bigdata.scala.chapter11

object Scala04_Generic {

    def main(args: Array[String]): Unit = {

        //val ints : List[Int] = List(1, 2, 3, 4)

        // (A1, A1) => A1
        //ints.reduce(_+_)

        // (B, Int) => B
        //ints.reduceLeft(_+_)

//        val userList = List(
//            new User("zhangsan"), new User("lisi"), new User("wangwu")
//        )
//
//        val user: Child = userList.reduce[Child](
//            (a, b) => {
//                a
//            }
//        )

       // println(user)





    }
    class Parent {

    }
    class User(var name:String) extends Parent {
        override def toString: String = {
            "User["+name+"]"
        }
    }
    class Child extends User("child") {

    }
}
