package com.bjsxt.designpattern.prototype;

public class Client4 {

    //直接新建对象的方法
    public static void testNew(int size) {
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop laptop = new Laptop();
        }
        long endtime = System.currentTimeMillis();
        System.out.println("testNew:" + (endtime-starttime));
    }

    //调用clone方法创建对象的方法
    public static void testClone(int size) throws CloneNotSupportedException {
        long starttime = System.currentTimeMillis();
        Laptop laptop = new Laptop();
        for (int i = 0; i < size; i++) {
            Object o = laptop.clone();
        }
        long endtime = System.currentTimeMillis();
        System.out.println("testClone:" + (endtime-starttime));
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        testNew(1000);
        testClone(1000);
    }
}

//定义一个笔记本类
class Laptop implements Cloneable {
    public Laptop() {
        try {
            Thread.sleep(10);//模拟对象创建耗时的过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();//直接调用Object对象的Clone()方法
       return o;
    }
}
