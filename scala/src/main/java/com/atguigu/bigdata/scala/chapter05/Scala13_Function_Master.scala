package com.atguigu.bigdata.scala.chapter05

import com.atguigu.bigdata.scala.bean.Task

import java.io.ObjectOutputStream
import java.net.Socket

object Scala13_Function_Master {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程
        val num = 4
        val logic = (num:Int)=>{println(num)}
        // 调度
        val task1 = new Task()
        task1.start = 1
        task1.end = num / 2
        task1.logic = logic

        val task2 = new Task()
        task2.start = num / 2 + 1
        task2.end = num
        task2.logic = logic

        val slaver1 = new Socket("localhost", 9999)
        val objOut1 = new ObjectOutputStream(slaver1.getOutputStream)
        objOut1.writeObject(task1)
        objOut1.flush()
        objOut1.close()


        val slaver2 = new Socket("localhost", 8888)
        val objOut2 = new ObjectOutputStream(slaver2.getOutputStream)
        objOut2.writeObject(task2)
        objOut2.flush()
        objOut2.close()

        slaver1.close()
        slaver2.close()

    }


}
