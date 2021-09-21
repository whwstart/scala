package com.atguigu.bigdata.scala.chapter06

object Scala12_Object_Trait_4 {

    def main(args: Array[String]): Unit = {

        // TODO Java为什么不支持多继承？？
        // 钻石问题

        // 初始化 （从左到右）
        // 功能叠加（从右向左）
        val mysql = new MySQL()
        mysql.operData()

    }
    trait Operate {
        def operData(): Unit = {
            println("插入数据")
        }
    }
    trait DB extends Operate {
        override def operData(): Unit = {
            print("向数据库中")
            super[Operate].operData()
        }
    }
    trait Log extends Operate {
        override def operData(): Unit = {
            print("向日志文件中")
            super.operData()
        }
    }
    class MySQL extends Log with DB {

    }
}