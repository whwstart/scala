package com.atguigu.bigdata.scala.demo;

public class TestString {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                test();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                test();
            }
        }).start();
    }
    public static void test() {
        StringBuilder s = new StringBuilder();
        for ( int i = 0; i < 100000; i++ ) {
            s.append(i);
        }
        System.out.println(s);
    }
}
