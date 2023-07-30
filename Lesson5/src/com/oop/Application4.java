package com.oop;

import com.oop.demo06.Person;
import com.oop.demo06.Student;

public class Application4 {
    public static void main(String[] args) {
        Person person = new Student();
        ((Student)person).go();//高转低
        Student student = (Student)person;

        Student student1 = new Student();
        student1.go();
        Person person1 = student1;
        //person1.go(); 报错，
        Student student2 = (Student) person1;
        student2.go();


    }
}
