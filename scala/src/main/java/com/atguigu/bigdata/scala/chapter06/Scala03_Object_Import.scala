package com.atguigu.bigdata.scala.chapter06


object Scala03_Object_Import {

    def main(args: Array[String]): Unit = {

        // TODO 面向对象编程 - import
        /*
          java import
          1. 导类
          2. 静态导入

         */
        // 马丁扩展了import关键字的功能
        // TODO Scala中可以使用下划线来代替java的星号
        // TODO import关键字可以声明在任意的地方
        //import java.util.Date
        //new Date()
        // TODO 默认导入
        // java => java.lang.*
        // scala => java.lang.*
        //       => scala.*
        //       => Predef.*
        //new Object()
        //println("abc")
        // TODO 同一个包中的类可以简化为一行
//        new util.ArrayList()
//        new util.HashMap()
        // TODO 真正地导包
//        new util.ArrayList()
//        new util.HashMap()
        // TODO 屏蔽类
        //import java.util._
        //import java.sql.{Date=>_, _}
        //new Date()
        // TODO 改名
        //import java.util.{HashMap=>JavaHashMap}
        //new JavaHashMap()
        // TODO 自己写的类和JDK的类重名了
        // scala中导入包路径时，默认的使用的是相对路径：相对当前包
        // 如果相对路径和绝对路径中同时存在相同的类，那么想要直接查找绝对路径中的类，需要使用特殊操作
        //println(new _root_.java.util.HashMap())
    }
}
//package java {
//    package util {
//        class HashMap {
//
//        }
//    }
//}
