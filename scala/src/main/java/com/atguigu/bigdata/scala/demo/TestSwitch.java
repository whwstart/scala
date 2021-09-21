package com.atguigu.bigdata.scala.demo;

public class TestSwitch {
    public static void main(String[] args) {

        int age = 40;

        // switch穿透现象
        // 马丁不认可,所以scala中没有switch语法. 但是认为这个功能非常强大。匹配规则
        // 马丁就参考后自己设定了一个语法：模式匹配
        switch (age) {
//            default :
//                System.out.println("other");
//                break;
            case 10 :
            case 20 :
                System.out.println("age = 20");
                break;
            case 30 :
                System.out.println("age = 30");
                break;

        }



    }
}
