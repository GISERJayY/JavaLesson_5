package com.oop.demo07;
//final 过后无法继承 断子绝孙 public final class Person{}
public class Person {
   //2、赋初始值
    {
        //代码块（匿名代码块）
        System.out.println("匿名代码块");
    }
    //1、只执行一次
    static {
        //静态代码块
        System.out.println("静态代码块");
    }
    public Person(){
        System.out.println("构造方法");
    }
   //3
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("=====================");
        Person P2 = new Person();
    }
}
/*
静态代码块
匿名代码块
构造方法
=====================
匿名代码块
构造方法
 */