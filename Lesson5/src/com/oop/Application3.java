package com.oop;

import com.oop.demo06.Person;
import com.oop.demo06.Student;
import com.oop.demo06.Teacher;

import javax.jws.soap.SOAPBinding;

public class Application3 {
    public static void main(String[] args) {
        //Object > Strint
        //Object > Person > Teacher
        // Object > Person > Student
        Object object = new Student();
        //System.out.println(x instanceof y);能编译通过，存在父子关系！
        System.out.println(object instanceof Student); //true
        System.out.println(object instanceof Person); // true
        System.out.println(object instanceof Object); // true
        System.out.println(object instanceof Teacher);// false
        System.out.println(object instanceof String); // false
        System.out.println("===================================");
        Person person = new Student();
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);编译报错！
        System.out.println("=============================");
        Student student = new Student();
        System.out.println(student instanceof  Student);
        System.out.println(student instanceof Person);
        System.out.println(student instanceof  Object);
        //System.out.println(student instanceof Teacher);编译报错！
        //System.out.println(student instanceof String);编译报错！


    }
}
