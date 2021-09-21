package com.atguigu.bigdata.scala.chapter12

object Scala02_Regex {

    def main(args: Array[String]): Unit = {

        // 长度为11
        // 全是数字
        //val r = "^\\d{11}$".r
        val r = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))[0-9]{8}$".r
        //val r = "^[0-9]{8}$".r
        // (13[0-9])
        // (14[5,7,9])
        // (15[^4])
        // (18[0-9])
        // (17[0,1,3,5,6,7,8])

        // TODO 准备数据
        val data = "00000000000"

        // TODO 使用规则校验数据
        val maybeString: Option[String] = r.findFirstIn(data)
        if (maybeString.isEmpty) {
            println("数据不符合规则")
        } else {
            println("数据符合规则：" +maybeString.get )
        }

    }
}
