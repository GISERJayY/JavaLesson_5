package com.oop.demo01;
//引用传递：对象本质还是值传递
//对象 内存
public class Demo5 {
    public static void main(String[] args) {
       Person person = new Person();
        System.out.println(person.neme); //null
        Demo5.change(person);
        System.out.println(person.neme);
    }
    public static void change(Person person){
        //person是一个对象：指向 ----> Person person = new Person();这是一个具体的人，可以改变属性！
        person.neme = "杨杰";
    }

}
//定义了一个person类，有一个属性name
class Person{
    String neme; //null
}
