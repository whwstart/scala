package com.atguigu.bigdata.scala.chapter07

object Scala09_Collection_Function_9 {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 常用函数 - sortBy
//        val list = List(1,4,2,3)
//        val list1 = List("1", "2", "3", "11", "22")

        // sortBy方法将集合中的每一条数据按照指定的规则进行排序,默认为升序
        // sortBy方法需要传递一个参数，参数类型为 Int => B
        //val sortList = list.sortBy(s => s).reverse
        //val sortList = list.sortBy(num=>num)(Ordering.Int.reverse)

        //println(sortList)
        val list = List(
            new User(2000, 30),
            new User(4000, 20),
            new User(3000, 30),
            new User(1000, 20)
        )

//        val sortList = list.sortBy(
//            user => {
//                user.age
//            }
//        )
//        val sortList1 = sortList.sortBy(
//            user => {
//                user.salary
//            }
//        )
        // Scala中有一个特殊的数据结构：元组，元组在排序时，会先按照第一个排，相同时，按照第二个排
//        val sortList1 = list.sortBy(
//            user => {
//                (user.age, user.salary)
//            }
//        )(Ordering.Tuple2[Int, Int]( Ordering.Int, Ordering.Int.reverse ))
        val sortList1 = list.sortWith(
            (a, b) => {
                // 将预期的结果返回为true
                if ( a.age < b.age ) {
                    true
                } else if ( a.age == b.age ) {
                    a.salary > b. salary
                } else {
                    false
                }
            }
        )

        println(sortList1)

    }
    class User( var salary : Int, var age:Int ) {
        override def toString: String = {
            s"User[${age}, ${salary}]"
        }
    }
}
