package com.atguigu.bigdata.scala.demo;

public class TestThreadSafe {
    public static void main(String[] args) throws Exception {

        User user = new User();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.name = "zhangsan";
                try {
                    Thread.sleep(1000);
                } catch ( Exception e ) {

                }
                System.out.println(user.name);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                user.name = "lisi";
                try {
                    Thread.sleep(1000);
                } catch ( Exception e ) {

                }
                System.out.println(user.name);
            }
        });

        t1.start();
        t2.start();

        System.out.println("main方法执行完毕");
        // main方法执行完毕
    }
}
class User {
    public String name = "";
}
