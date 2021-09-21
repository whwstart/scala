package com.atguigu.bigdata.scala.chapter02

import java.io.{InputStream, ObjectInputStream}
import java.net.{ServerSocket, Socket}

object Scala05_IO_Server_Obj {

    def main(args: Array[String]): Unit = {

        val server = new ServerSocket(9999)
        println("服务器启动成功...等待客户端的连接")
        val client: Socket = server.accept()// 阻塞
        println("客户端已经连接,等待接收客户端传递的数据")
        val objIn = new ObjectInputStream(client.getInputStream)
        val obj = objIn.readObject()
        println("获取客户端发送的数据：" + obj)
        objIn.close()
        client.close()
        server.close()

    }
}
