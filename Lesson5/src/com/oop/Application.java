package com.oop;

import com.oop.demo05.A;
import com.oop.demo05.B;
import com.oop.demo05.Student;

public class Application {
    public static void main(String[] args) {
            A a= new A();
            a.test();
            B b = new A();
            b.test(); //创建了个b的对象指向A,调用的是b类的静态方法
        /*
                即b是A new出来的对象，因此调用了A的方法
                因为静态方法是类的方法，而非静态是对象的方法
                有static时，b调用了B类的方法，因为b是用b类定义的
                没有static时，b调用的是对象的方法，而b是用A类new的

         */

    }

    }
/*
 //一个项目只存在一个main方法
        public static void main(String[] args) {
            //类：抽象的，实例化
            //实例化后会返回一个自己的对象！
            //student对象就是Student类的具体实例
            com.oop.demo02.Student student = new com.oop.demo02.Student();
            student.age = 1;
            int a = 1;
            System.out.println(student.age==a);
        }
 */
/*
public static void main(String[] args) {
       Student s1 = new Student();
       s1.setName("yangjie");
       s1.setAge(120);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
 */
/*
Student student1 = new Student();
        //System.out.println(student1.money);
 */