package com.atguigu.bigdata.scala.chapter12

object Scala01_Regex {

    def main(args: Array[String]): Unit = {

        // TODO 正则表达式
        // 正则表达式和模式匹配很像
        // 所谓的模式匹配就在匹配数据的规则
        // 正则表达式在匹配字符串的规则
        // TODO 声明规则
        val r = "^n+$".r

        // TODO 准备数据
        val data = "nnnnn"

        // TODO 使用规则校验数据
        val maybeString: Option[String] = r.findFirstIn(data)
        if (maybeString.isEmpty) {
            println("数据不符合规则")
        } else {
            println("数据符合规则：" +maybeString.get )
        }

    }
}
