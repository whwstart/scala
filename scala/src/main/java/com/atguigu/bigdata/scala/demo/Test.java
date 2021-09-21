package com.atguigu.bigdata.scala.demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        // 方法重载看的是类型，但是如果类型没有匹配上，会扩大类型的范围继续查找
//        BB aa = new BB();
//        test(aa);
//
//        Map map = new HashMap();//..put("a", "1");
//        final Set<Map.Entry> set = map.entrySet();
//        //map.// Node, TreeNode
//        map.put(null, null);
//        final Hashtable<String, String> stringStringHashtable = new Hashtable<>();
//        stringStringHashtable.put(null, null);
        String[] ss = new String[4];
        int len = ss.length; // 4
        String s = new String();
        s.length();  // char[]
        List list = new ArrayList();
        list.size(); // 大小
        Map map = new HashMap();
        map.size();
    }

    public static void test(AA aa) {
        System.out.println("aaaa");
    }
//    public static void test( BB bb ) {
//        System.out.println("bbbb");
//    }

    // Set trait
    // Set$.apply() objet {
        //new Runa
    //}
}
class AA {

}
class BB extends AA {

}
interface CC {
    public static void test() {

    }
}
