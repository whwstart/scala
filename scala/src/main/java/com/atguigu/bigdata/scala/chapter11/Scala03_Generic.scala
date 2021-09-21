package com.atguigu.bigdata.scala.chapter11

object Scala03_Generic {

    def main(args: Array[String]): Unit = {

        // TODO 泛型的使用
        // scala中的泛型采用中括号声明
        // TODO 泛型不可变
        //val m1 : Message[User] = new Message[User]
        //val m2 : Message[User] = new Message[Parent]
        //val m3 : Message[User] = new Message[Child]
        // TODO scala中的泛型可以变
        // 类型和泛型不是一个层次的。马丁可以让他们两是一个层次的。将类型和泛型当成整体来用
        // Array[String] => String[]
        // 使用特殊符号可以将类型和泛型当成整体
        // 1. + ：协变， 如果泛型之间存在父子关系，那么当成整体后也存在父子关系
        // 2. - : 逆变，如果泛型之间存在父子关系，那么当成整体后也存在子父关系
        //val m1 : Message[User] = new Message[User]
        //val m2 : Message[User] = new Message[Parent]
        //val m3 : Message[User] = new Message[Child]
        // TODO scala中的泛型也存在上限，下限,使用颜文字
        val p = new Producer[User]()
       //p.produce(new Message[User]())
        //p.produce(new Message[Parent]())
        //p.produce(new Message[Child]())

        val c = new Consumer[User]()
        val t: User = c.consume().t





    }
    class Message[T] {
        var t : T = _
    }
    class Producer[T] {
        def produce( m : Message[_ >: T ] ): Unit = {

        }
    }
    class Consumer[T] {
        def consume(): Message[ _ <: T ] = {
            return null
        }
    }
    class Parent {

    }
    class User extends Parent{

    }
    class Child extends User {

    }
}
