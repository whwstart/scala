package com.atguigu.bigdata.scala.test;

public class TestOper {
    public static void main(String[] args) {

        // 自动装箱原理 : XXXXX.valueOf
        // 包装类型的比较不要使用双等号
        //Integer i = 128;
        //Integer j = 128;
        //System.out.println(i == j);
        //System.out.println(i.equals(j));

//        String s1 = new String("abc");
//        String s2 = new String("abc");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

        //byte b = 127;
        //byte b1 = b++; // 一元运算符 （byte）(b+1)
        //b = b++;
        //System.out.println(b1);
        //System.out.println(b);

        // 赋值：等号右边的计算结果给左边
        //int i = 0;
        //i = i++; // 1) _tmp = i++; 2) i = _tmp
        //System.out.println(i);

        // 阶乘 ： 一个大于1的数的阶乘等于这个数乘以这个数减一的阶乘
        // 5! = 5 * 4! = 5 * 4 * 3! = 5 * 4 * 3 * 2! = 5 * 4 * 3 * 2 * 1 = 120
        System.out.println(test(5));

    }
    public static int test(int num) {
        if ( num <= 1 ) {
            return 1;
        } else {
            return num * test(num-1);
        }
    }
}
