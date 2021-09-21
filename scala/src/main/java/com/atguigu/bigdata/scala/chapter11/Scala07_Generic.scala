package com.atguigu.bigdata.scala.chapter11

import scala.collection.mutable

object Scala07_Generic {

    def main(args: Array[String]): Unit = {
        def f[A : Test](a: A) = println(a)

//        implicit val test : Test[Parent] = new Test[Parent]
//        f( new User() )

        //List(1,2,3,4).sortBy(num=>num)

    }
    class Test[T] {
    }
    class Parent {
    }
    class User extends Parent{
    }
    class SubUser extends User {
    }
}
