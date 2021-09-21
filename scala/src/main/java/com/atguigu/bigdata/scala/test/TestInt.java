package com.atguigu.bigdata.scala.test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestInt {

    public static void main(String[] args) {

        // 1. byte类型方法存在的时候，为什么调用byte， int
        //    重载：不同的方法，巧了，方法名一样，该如何区分？靠参数列表（个数，类型，顺序）
        // 2. 当指定类型不存在的时候，如果类型为基本数据类型，可以在不改变数值的情况下，扩大精度
        //    00000001 => byte
        //    00000000 00000001 => short
        //    00000000 00000000 00000000 00000001 => int
        //byte b = 10;
        //test(b);
        //char i = 10;
        //int ii = c +;
        //char c = 'A';
        //char c1 = c + 1;

        //int i = 128;
        //byte b = (byte)i;
        //System.out.println(b);

        // 截取精度（位）
        // 0000 0000 0000 0000  0000 0000 1000 0000
        //                                1000 0000
        // 高位（符号位） 0 - 正数，1 - 负数
        // 1 - 000 0000 => 1位负数 + 7位最小值 => 8位负数的最小值 => -128
        // 1111 1111 => -1
        // 1000 0001 => -127
        // 1111 1110 => -2
        int j = 10;
        int i = j;

        "String".intern();



        test('a');

    }
//    public static void test( byte b ) {
//        System.out.println("bbbb");
//    }
//    public static void test( short s ) {
//        System.out.println("ssss");
//    }
    public static void test( char c ) {
        System.out.println("cccc");
    }
//    public static void test( int i ) {
//        System.out.println("iiii");
//    }
}
