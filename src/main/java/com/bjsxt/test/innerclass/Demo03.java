package com.bjsxt.test.innerclass;

public class Demo03 {
    public static void main(String[] args) {
        Outer03 outer03 = new Outer03();
        Outer03.FiledInnerClass ic = outer03.new FiledInnerClass();
        ic.test();
    }
}

class Outer03{
    private int a =6;
    private static String b = "hahah";

    //成员内部类
    class FiledInnerClass{
        void test(){
            System.out.println(a);
            System.out.println("内部类对象：" + this);
            System.out.println("外部类对象：" + Outer03.this);
        }
    }
}
