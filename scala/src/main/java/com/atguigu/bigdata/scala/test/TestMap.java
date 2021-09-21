package com.atguigu.bigdata.scala.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

        Map<UserKey, UserKey> userMap = new HashMap<UserKey, UserKey>();

        for ( int i = 1; i < 20; i++ ) {
            userMap.put(new UserKey(), new UserKey());
            System.out.println(i);
        }

    }
}
class UserKey {

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }
}
