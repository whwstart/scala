package com.atguigu.bigdata.scala.demo;

public class TestException {
    public static void main(String[] args) {

        try {

            // 鲁棒性=>健壮性
            int i = 0;
//            if ( i != 0 ) {
//
//            }

            int j = 10 / i;
        } catch ( ArithmeticException e ) {
            System.out.println("除数为0的异常");
        } catch ( Exception e ) {
            e.printStackTrace();
        }


    }
}
