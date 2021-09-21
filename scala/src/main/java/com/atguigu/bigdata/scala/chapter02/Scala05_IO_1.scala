package com.atguigu.bigdata.scala.chapter02

import java.io.{File, PrintWriter}
import scala.io.{BufferedSource, Source}

object Scala05_IO_1 {

    def main(args: Array[String]): Unit = {

        // TODO
        val writer = new PrintWriter(new File("output/test.txt" ))
        writer.write("Hello Scala")
        writer.close()
    }
}
