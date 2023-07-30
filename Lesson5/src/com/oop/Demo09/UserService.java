package com.oop.Demo09;
//interface 定义的关键字 ，接口都需要实现类
public interface UserService {
    //常量 public static final
    public static final int age = 10;
    //接口中所有定义其实都是抽象的 public abstract
     public abstract void add(String name);
     void delete(String name);
     void update(String name);
     void query(String name);
}
