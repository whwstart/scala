package com.atguigu.bigdata.scala.chapter02

import com.atguigu.bigdata.scala.bean.User

import java.io.{ObjectOutputStream, OutputStream}
import java.net.Socket

object Scala05_IO_Client_Obj {

    def main(args: Array[String]): Unit = {

        // TODO
        val client = new Socket("localhost", 9999)
        println("服务器连接成功")

        val user = new User();
        user.age = 20

        val objOut = new ObjectOutputStream(client.getOutputStream)
        objOut.writeObject(user)
        objOut.close()
        println("向服务器发送数据成功")
        client.close()
    }
}
