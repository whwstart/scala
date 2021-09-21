package com.atguigu.bigdata.scala.test;

public class TestDesign {
    public static void main(String[] args)  {

        // TODO 模板方法设计模式(照猫画虎)
        // 1. 存在父子类
        // 2. 父类应该在某一个方法中存在算法的骨架
        // 3. 具体的实现由子类来重新
        // 4. 可以根据不同的子类对象完成不同具体的操作
        Parent p = new Dept();
        p.execute();

    }

}
abstract class Parent {
    public void execute() {
        // 执行初始化操作（连接数据库）
        initConnection();
        // 操作数据库
        operationDB();
        // 执行结束操作（关闭数据库）
        closeConnection();
    }
    protected void initConnection() {
        System.out.println("init connection...");
    }
    protected abstract void operationDB();
    protected void closeConnection() {
        System.out.println("close connection...");
    }
}
class User extends Parent{
    @Override
    protected void operationDB() {
        System.out.println("operation user table");
    }
}
class Dept extends Parent{
    @Override
    protected void operationDB() {
        System.out.println("operation dept table");
    }
}
