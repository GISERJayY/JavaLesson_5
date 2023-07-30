package com.oop.demo07;

public class Student {
    private  static  int age; //静态的变量
    private  double score;//静态的变量

    public void run(){

    }
    public  static  void go(){

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.age);
        System.out.println(s1.score);
        System.out.println(Student.age);
        //System.out.println(Student.score); //类无法调用静态属性
        go();//可直接访问静态方法
       // run();不可以
    }
}
