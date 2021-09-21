package com.atguigu.bigdata.scala.test;

public class TestThread {
    public static void main(String[] args) {

        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();

        // 字体不一样
        // sleep静态方法
//        t1.sleep(1000); // 休眠的线程不是t1, 主线程休眠
//        // wait成员方法
//        t2.wait(); // 等待的线程是t2

    }
}
