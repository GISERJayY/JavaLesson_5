package com.oop;

import com.oop.Demo10.Outer;

public class Application5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过这个外部类来实例化内部类
        Outer.Inner inner= outer.new Inner();
        inner.getId();
    }
}
