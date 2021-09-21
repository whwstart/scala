package com.atguigu.bigdata.scala.bean;

import java.io.Serializable;

public class User implements Serializable {
    public int age;
    public static int name;
//    static {
//        age = 20;
//        System.out.println("user init....");
//    }

    @Override
    public String toString() {
        return "User["+age+"]";
    }
}
