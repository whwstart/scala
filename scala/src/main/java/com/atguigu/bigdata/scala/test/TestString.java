package com.atguigu.bigdata.scala.test;

public class TestString {
    public static void main(String[] args) {

        // !,.!
        // !，。!
//        String s = " a b ";
//        s = s.trim(); // 首尾半角空格
//        test(s);
//        System.out.println("!"+s+"!");

        // A : !a b!
        // B : ! a b !
    }
    // 方法参数的传递 ：值传递
    //public static void test( String s ) {
        //s.trim();
    //}
    public static boolean isNotEmpty( String content ) {
        return content != null && !content.trim().equals("");
    }
}
