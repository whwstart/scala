package com.atguigu.bigdata.scala.bean;

public class Child extends Student{
    public String name = "lisi";
    public Child() {

    }
    public void Child() {

    }

    public void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
