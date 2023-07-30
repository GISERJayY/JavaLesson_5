package com.oop.demo02;

public class Person {
    //一个类即使什么都不写，它也会存在一个方法
    //现性的定义构造方器
    String name;
    //1、使用new关键字，本质就是调用构造器
    //2、用来初始化值
    public  Person(){
         // this.name = "杨杰";
    }
    //有参构造器:一旦定义了有参构造，无参构造必须显示定义
    public Person(String name){
        this.name = name;
    }
    // win： alt + insert 选 constructor 快速进入创建构造器
    // mac： cmd + n

}
    /*
         构造器：
            1、和类名相同
            2、没有返回值
         作用：
            1、使用new关键字，本质就是调用构造器
            2、初始化对象的值
         注意点：
            1、一旦定义了有参构造，无参构造必须显示定义
     */