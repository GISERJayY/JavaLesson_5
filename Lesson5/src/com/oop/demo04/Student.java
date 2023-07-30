package com.oop.demo04;

public class Student {
    //名字
    private String name;
    //学号
    private int id;
    //性别
    private String sex;
    private int age;
    //学习（）
    //睡觉（）

    //cmd+n
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       if (age>=120){
           this.age = 2;
       }else {
           this.age = age;
       }

    }
}
