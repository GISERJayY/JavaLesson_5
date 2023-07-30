package com.oop.demo05;
//在java中，所有类都默认直接继承或间接继承object
public class Person {
    public Person(){
        System.out.println("person无参执行");
    }
        protected String name = "yangjie";
        //私有的东西无法继承
        private void print(){
            System.out.println("yangjie");
        }
}
/*
private int money = 10000000 ;
    public void say(){
        System.out.println("说话");
         }
 */