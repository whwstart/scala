package com.atguigu.bigdata.scala.chapter08

object Scala02_Match {

    def main(args: Array[String]): Unit = {

//        def describe(x: Any) = {
//            x match {
//                case 5 => "Int five"
//                case "hello" => "String hello"
//                case true => "Boolean true"
//                case '+' => "Char +"
//            }
//        }

        // 在匹配类型时，一般类型前增加变量名称
        // 模式匹配中的类型匹配不考虑泛型(数组除外)。
        // 数组的泛型不叫泛型
        // List<User> => List[User]
        // String[] => Array[String]
        def describe(x: Any) = {
            x match {
                case i: Int => i+1
                case s: String => "String hello"
                case m: List[String] => "List"
                case c: Array[Int] => "Array[Int]"
                case something => "something else " + something
            }
        }

        println(describe(List(1,2,3)))

    }
}
