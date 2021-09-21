package com.atguigu.bigdata.scala.chapter02

object Scala04_String {

    def main(args: Array[String]): Unit = {

        // TODO 字符串
        // scala中没有字符串，使用的字符串其实都是java的字符串
        //println("abc".substring(0,1).toUpperCase())

        // 字符串拼接
        val name = "zhangsan"
        val age = "30"

        //println("姓名：" + name + ", xxxx")

        // JSON : {"username":"zhangsan", "age":"30"}
        // JSON字符串
        // JavaScript Object Notation
        //val json = "{\"username\":\""+name+"\", \"age\":\""+age+"\"}"
        //println(json)

        // 传值字符串
        // 传值字符串(格式化字符串)
        //printf("name=%s\n", name)

        // 插值字符串
        ///println(s"name=${name}")
       // println("name=${name}")
        //println(s"{\"username\":\"${name}\", \"age\":\"${age}\"}")

        // 多行字符串
        // 字符串中的竖线称之为顶格符号
//        println(
//            """
//               a
//              | b
//              | c
//              |""".stripMargin('#'))

        // 多行字符串使用的场景最多的是：JSON & SQL

        println(
            s"""
              | {"username":"${name}", "age":"${age}"}
              |""".stripMargin)

        //println("select * from (select * from user u join dept d on u.deptid = d.id) t1 group by age")

        println(
            """
              | select
              |    *
              | from user u
              | join dept d on u.deptid = d.id
              | where id = 1
              |""".stripMargin)



    }
}
