package com.oop.demo05;
//子类继承了父类，就会拥有父类全部的方法
public class Student extends Person {
    public Student(){
        this("yangjie");//调用自己或父类都必须在第一个而且要么调用父类构造器要么调用子类构造器
        //隐藏代码 调用了子类的无参构造器方法
       // super();//调用父类的构造器必须在子类构造器的第一行
        System.out.println("student无参执行");
    }

    public Student(String name) {
        this.name = name;
    }

    //ctrl + h 继承树快捷键
    private String name = "yangjie";
    public void print(){
        System.out.println("杨杰");
    }
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void  test1(){
        print();
        this.print();
        //super.print();
    }

}
