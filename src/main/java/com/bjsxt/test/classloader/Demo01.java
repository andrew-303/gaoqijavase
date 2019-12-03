package com.bjsxt.test.classloader;

/**
 * JVM核心机制-类加载全过程-初始化时机-类的主动引用和被动引用-静态初始化块执行顺序问题
 */
public class Demo01 {
    static {
        System.out.println("静态初始化Demo1");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //主动引用，一定会发生类的初始化
//        A a = new A();    //new 一个类的对象
//        System.out.println(A.width);//调用类的静态成员
//        Class.forName("com.bjsxt.test.classloader.A");//反射调用

        //被动引用，不会发生类的初始化
//        System.out.println(A.Max);//引用常量不会触发类的初始化
//        A[] as = new A[10];//通过数组定义类引用
        System.out.println(B.width);//通过子类引用父类的属性，不会对子类初始化
    }
}

class A extends A_Father{
    public static int width=100;//静态变量，静态域    field
    public static final  int Max=500;

    static {
        System.out.println("静态初始化类A");
    }

    public A(){
        System.out.println("创建A类的对象");
    }
}

class A_Father {
    static {
        System.out.println("静态初始化类A_Father");
    }
}

class B extends A{
    static {
        System.out.println("静态初始化类B");
    }
}