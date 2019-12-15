package com.bjsxt.designpattern.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        //调用饿汉式的单例方法
        Singleton01 instance = Singleton01.getInstance();
        Singleton01 instance1 = Singleton01.getInstance();
        System.out.println(instance==instance1);

        //调用懒汉式的单例方法
        Singleton02 instance2 = Singleton02.getInstance();
        Singleton02 instance3 = Singleton02.getInstance();
        System.out.println(instance2==instance3);

        Singleton04 instance4 = Singleton04.INSTANCE;
        Singleton04 instance5 = Singleton04.INSTANCE;
        System.out.println(instance4==instance5);


    }
}
