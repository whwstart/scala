package com.atguigu.bigdata.scala.demo;

public class TestOverride {
    public static void main(String[] args) {

//        Parent p = new Parent();
//        System.out.println(p.sum()); // 20
//
//        Child c = new Child();
//        System.out.println(c.sum()); // 40
//
//        Parent p1 = new Child();
//        System.out.println(p1.sum()); // 40

        Parent p2 = new Child();
        System.out.println(p2.sum()); // 20

        // TODO java中方法的重写遵循动态绑定机制
        // 在JVM调用对象的成员方法时，会将方法和实际的对象内存进行绑定，然后调用
        // 属性的调用不存在动态绑定
        Parent p3 = new Child();
        p3.test();

    }
    public static void test() {

    }
}
class Parent {
    public int i = 10;
    public int sum() {
        return getI() + 10;
    }
    public int getI() {
        return i;
    }
    public void test() {
        System.out.println("parent test...");
    }
}
class Child extends Parent {
    public int i = 20;
//    public int sum() {
//        return i + 20;
//    }
    public int getI() {
        return i;
    }
    public void test() {
        System.out.println("child test...");
    }
}
