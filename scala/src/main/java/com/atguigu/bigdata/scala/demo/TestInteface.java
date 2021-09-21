package com.atguigu.bigdata.scala.demo;

public class TestInteface {
    public static void main(String[] args) {

        // 多态传递
        A a = new C();
        System.out.println(a);

        // 接口和父子类无关，只和当前类有关,同一级别
        System.out.println(C.class.getInterfaces().length);
    }
}
interface A {

}
class D {

}
class B extends D implements A {

}
class C extends B {

}
