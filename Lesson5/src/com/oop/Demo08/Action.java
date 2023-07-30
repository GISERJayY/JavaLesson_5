package com.oop.Demo08;
//抽象类 ：类 extends: 单继承 （接口可以多继承）
public abstract class Action {
        //约束，有人帮我们实现
        //abstract ，抽象方法，只有方法的名字，没有具体的实现。
        public abstract void doSomeThing();

        //1.不能new这个抽象类，只能靠子类去实现他：约束
        //2.抽象类中可以写普通方法
        //3.抽象方法必须在抽象类中
        //抽象的抽象：约束
}
