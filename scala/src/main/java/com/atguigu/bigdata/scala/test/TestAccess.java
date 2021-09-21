package com.atguigu.bigdata.scala.test;

public class TestAccess {
    public static void main(String[] args) throws Exception {

        // TODO 访问权限 : 权力和限制
        // 方法的提供者是谁？com.atguigu.bigdata.scala.test.AAA
        // 方法的调用者是谁？com.atguigu.bigdata.scala.test.TestAccess
        //Object aaa = new AAA();
        //aaa.clone();
    }
}
class AAA {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

