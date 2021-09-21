package com.atguigu.bigdata.scala.chapter10

object Scala05_Transform {

    def main(args: Array[String]): Unit = {

        // 隐式参数
        def reg( implicit password : String = "000000" ): Unit = {
            println("注册用户，密码为 = " + password)
        }

        // 隐式变量
        //implicit val pswd : String = "123123"

        //reg

        // 函数柯里化
        List(1,4,2,3).sortBy(num=>num)

    }

}
