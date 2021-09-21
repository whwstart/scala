package com.atguigu.bigdata.scala.chapter07

object Scala02_Collection_Array {

    def main(args: Array[String]): Unit = {

        // TODO 集合 - 数组

        // String[] ss = new String[3]
        // ss[0] = "1" // 修改值
        // ss[1] = "2"
        // ss[2] = "3"
        // 构建集合
        // Array数组在编译后其实就是java中的数组
        val array : Array[String] = new Array[String](3)

        // 数据的增加，修改，删除，查询
        array(0) = "a"
        //println(array(0))
        array(1) = "b"
        array(2) = "c"

        // [Ljava.lang.String;@11531931 => java array
        // java中数组的类型就是 : String[]
        // {} => Map
        // [] => List
        //println(array)
//        for ( i <- array ) {
//            print(i+" ")
//        }
        //println(array.mkString(","))
        // foreach方法的作用是将集合中的每一个元素进行处理
        // foreach方法需要传递一个参数，这个参数的类型为 ： String=>U
//        def foreachFunction( s:String ): Unit = {
//            println(s)
//        }
//
//        array.foreach(foreachFunction)
//
//        array.foreach(
//            ( s:String ) => {
//                println(s)
//            }
//        )
//
//        array.foreach(
//            ( s:String ) => println(s)
//        )
//
//        array.foreach(
//            ( s ) => println(s)
//        )
//
//        array.foreach(
//            s => println(s)
//        )

        array.foreach(println(_))



    }
}
