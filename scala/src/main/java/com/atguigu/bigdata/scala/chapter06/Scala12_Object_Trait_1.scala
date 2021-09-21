package com.atguigu.bigdata.scala.chapter06

object Scala12_Object_Trait_1 {

    def main(args: Array[String]): Unit = {

        // TODO 特质
        // 在java中，分不清接口和抽象类的区别
        // 在scala中，将接口和抽象类合二为一，统称为trait
        // 所以可以将trait理解为接口和抽象类的结合体
        // java中所有的接口在scala中都当成特质来用

    }
    trait Test extends Exception {

    }
    class Parent {

    }
    class User extends Test with Serializable {

    }
}