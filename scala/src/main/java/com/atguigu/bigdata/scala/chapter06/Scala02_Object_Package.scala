package com
package atguigu
package bigdata
package scala {
    class Test {

    }
    package chapter06 {
        package chapter066 {
            object Test {
                def main(args: Array[String]): Unit = {
                    println(packageName)
                }
            }
        }
        object Scala02_Object_Package {

            def main(args: Array[String]): Unit = {

                // TODO 面向对象编程 - package

                /*
                   java package :
                   1. 管理类 => 不是必须的
                   2. 区分相同的名称类 => 不是必须的
                   3. 访问权限 => 不是必须的

                   马丁说：java中的package语法不够强大，所以给它赋予更多的功能
                 */
                // TODO 包起名
                // 顶级域名的反写 + 项目名 + 模块名 + 类型名称 +类名
                // com.atguigu.bigdata.user.bean.UserBean
                // com.atguigu.bigdata.user.util.StringUtil
                // c.a.b.u.util.StringUtil
                // TODO 包名
                // package后面的内容称之为包的全路径名称
                // java中点什么意思:不是调用，表示从属关系
                //        User user1 = new User()
                //        User user2 = new User()
                //        user1.name = "zhangsan"
                // 马丁让package关键字可以多次声明
                // TODO 包的层次（上下级）
                // 在scala的同一个源码中，子包可以直接访问父包中的内容，无需导入
                // TODO 物理路径和包路径可以不相同
                // TODO 将包当成对象来用,可以声明属性和方法
                println(packageName)
                testPackage()
            }
        }
    }
}


