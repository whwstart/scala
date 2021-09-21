package com.atguigu.bigdata.scala.chapter11;

import com.atguigu.bigdata.scala.bean.Message;
import com.atguigu.bigdata.scala.bean.User;

public class Scala01_Generic {
    public static void main(String[] args) {

        // TODO 泛型
        // 1. 泛型和类型的关系？
        // List<User> userList = new ArrayList();
        // 类型和泛型层次不一样
        //    类型是用于约束外部对象的类型
        //    泛型是用于约束内部对象的类型
        Message<User> userTest = new Message<User>();
        //userTest.t
        // 2. 因为泛型可以约束内部数据类型，所以有的时候也称之为类型参数
        // 当不传递这个泛型时，JVM会使用通用数据类型来表示Object
        Message test = new Message();
        //test.t
        // 3. 泛型擦除
        // 泛型只在编译时有效，运行时没有泛型
        // 泛型在编译后就不存在了，纯粹是编译语法。
    }

}