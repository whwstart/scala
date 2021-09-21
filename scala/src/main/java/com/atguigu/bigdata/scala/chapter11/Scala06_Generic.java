package com.atguigu.bigdata.scala.chapter11;

import java.util.*;

public class Scala06_Generic {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);

        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("a", 4);
        map2.put("d", 5);
        map2.put("c", 6);
        // { a->5, b->2, d->5,c->9 }
        final Iterator<String> iterator = map2.keySet().iterator();
        while ( iterator.hasNext() ) {
            final String key = iterator.next(); // a, d, c
            Integer oldV = map1.get(key);
            if ( oldV == null ) {
                oldV = 0;
            }
            Integer newV = map2.get(key) + oldV;
            map1.put(key, newV);
        }

        System.out.println(map1);
    }
}
