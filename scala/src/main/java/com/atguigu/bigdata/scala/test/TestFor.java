package com.atguigu.bigdata.scala.test;

import java.util.List;

public class TestFor {
    public static void main(String[] args) {

        List list = null;

        //List.iterator
        for ( Object obj : list ) {
            System.out.println(obj);
        }

        //System.out.println(list);

        // TODO 空指针异常 : 调用为空（null）对象的成员方法或成员属性时，会发生空指针异常
        //Emp emp = new Emp();
        //System.out.println(emp);

        // 自动拆箱 : Integer.intValue
        // int <= Integer
        //test(emp.age);

    }
    public static void test( int age ) {
        System.out.println(age);
    }
}
class Emp {
    public static Integer age;
}
