package com.atguigu.bigdata.scala.chapter05

import com.atguigu.bigdata.scala.bean.Task

import java.io.ObjectInputStream
import java.net.{ServerSocket, Socket}

object Scala13_Function_Slaver2 {

    def main(args: Array[String]): Unit = {

        val server = new ServerSocket(8888);
        println("slaver[8888]服务启动，等待master连接")
        val master: Socket = server.accept()
        println("slaver[8888]等待master传输数据")


        val objIn = new ObjectInputStream(master.getInputStream)
        val obj = objIn.readObject()
        val task: Task = obj.asInstanceOf[Task]
        // 执行任务
        task.run()
        objIn.close()

        master.close()
        server.close()
    }


}
