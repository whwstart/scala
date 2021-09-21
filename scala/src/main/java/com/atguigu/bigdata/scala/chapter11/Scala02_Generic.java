package com.atguigu.bigdata.scala.chapter11;

import com.atguigu.bigdata.scala.bean.Emp;
import com.atguigu.bigdata.scala.bean.Message;
import com.atguigu.bigdata.scala.bean.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Scala02_Generic {
    public static void main(String[] args) {

        // TODO 泛型
        // TODO 4. 泛型约束的时机
        //    泛型只在声明后的代码中编译有效
        //    泛型只对类型操作时进行编译
//        List list = new ArrayList();
//        list.add(new Emp());
//        List<User> userList = list;
//        //.....
//        //System.out.println(userList);
//        for ( User user : userList ) {
//            System.out.println(user);
//        }
        // TODO 5. 类型在使用时可以替换，和泛型无关
        //Collection<String> list = new ArrayList<String>();
        //test(list);

        // TODO 6. 泛型不可变
        List<UserX> userList1 = new ArrayList<UserX>();
        //List<UserX> userList2 = new ArrayList<ParentX>();
        //List<UserX> userList3 = new ArrayList<ChildX>();

        // TODO 7. 泛型下限 （生产数据）
        Producer<UserX> p = new Producer<UserX>();
        //p.produce(new Message<UserX>());
       // p.produce(new Message<ParentX>());
        //p.produce(new Message<ChildX>());

        // TODO 7. 泛型上限 (消费数据)
        Consumer<UserX> c = new Consumer<UserX>();
        final UserX data = c.getMessage().data;

    }
    public static void test(Collection<Object> list) {

    }



}
class Consumer<T> {
    public Message<? extends T> getMessage() {
        return null;
    }
}
class Producer<T> {
    public void produce( Message<? super T > message ) {

    }
}
class ParentX {

}
class UserX extends ParentX {

}
class ChildX extends UserX {

}