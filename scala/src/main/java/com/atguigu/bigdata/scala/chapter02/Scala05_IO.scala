package com.atguigu.bigdata.scala.chapter02

import scala.io.{BufferedSource, Source}

object Scala05_IO {

    def main(args: Array[String]): Unit = {

        // TODO
        // 标准化屏幕输入
        // val age : Int = scala.io.StdIn.readInt() // 阻塞
        // println(age)
        println(System.getProperty("user.dir"))
        // 从文件中获取
        // 绝对路径 : 不可改变的路径
        //          协议：//地址（路径）
        //          http://www.baidu.com:80/test/test.html
        //          file://c:/test/test.html
        //          file:///test/test.html
        // 相对路径 : 可以改变的路径，应该存在一个基准路径
        //           idea中默认的基准路径就是项目的根路径
        val source: BufferedSource = Source.fromFile("data/word.txt")
        val lines: Iterator[String] = source.getLines()
        while ( lines.hasNext ) {
            val line: String = lines.next()
            println(line)
        }


        source.close()
    }
}
