package com.oop.demo01;

public class Student {
    //静态方法
    public static void say(){
        System.out.println("学生说话");
    }
    //非静态方法
    public  void say1(){
        System.out.println("学生说话2");
    }
     //static 和类一起加载
    public static  void a(){
        //b(); 如果a方法和b方法都是static就可以相互调用方法
    }
    //类实例化才存在
    public void  b(){

    }
}
