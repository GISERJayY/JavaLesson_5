package com.oop.demo01;

public class demo01 {
    //main方法
    public static void main(String[] args) {
        String man = sayHello();
        System.out.println(man);
    }
    /*
        修饰符 返回值 方法名(...){
            //方法体
             return 返回值;
        }
     */
    public static String sayHello(){
        return "hello,world";
    }

    public static int max(int a,int b){
         return  a > b ? a:b; //三元运算符号
    }

}
