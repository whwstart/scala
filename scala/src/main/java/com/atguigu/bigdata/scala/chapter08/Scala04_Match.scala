package com.atguigu.bigdata.scala.chapter08

object Scala04_Match {

    def main(args: Array[String]): Unit = {
        // 模式匹配
        //val (id, name, age, _) = (1, "zhangsan", 30, 100)

        //println(age)

//        val map = Map(
//            ( "a", 1 ),
//            ( "b", 2 ),
//            ( "c", 3 )
//        )
//        for ( (k, 2) <- map ) {
//            println(k)
//        }

        val map = Map(
            (("河北", "鞋"), 10),
            (("河南", "衣服"), 20),
            (("河北1", "帽子"), 30)
        )
        // (("河北", "鞋"), 10)
        // =>
        // ("河北", ("鞋", 20))

        // 匿名函数再使用模式匹配时：
        // 1. 不能省略case关键字
        // 2. 方法的小括号需要改成大括号
//        val map1 = map.map {
//            case ((prv, item), cnt) => {
//                ( prv, (item, cnt * 2) )
//            }
//        }
//
//        println(map1)
        val map1 = Map(
            ("a", 1),
            ("b", 2),
            ("c", 3)
        )

        map1.foreach {
            case (word, count) => {
                println(word + "=" + count)
            }
        }

    }
}
