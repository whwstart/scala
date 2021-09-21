package com.atguigu.bigdata.scala.chapter02

import java.io.{File, OutputStream, PrintWriter}
import java.net.Socket

object Scala05_IO_Client {

    def main(args: Array[String]): Unit = {

        // TODO
        val client = new Socket("localhost", 9999)
        println("服务器连接成功")
        val out: OutputStream = client.getOutputStream
        out.write(300)
        out.close()
        println("向服务器发送数据成功")
        client.close()
    }
}
