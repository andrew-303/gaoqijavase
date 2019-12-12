package com.bjsxt.test.innerclass;

public class Demo02 {
    public static void main(String[] args) {
        Outer02.StaticInnerClass staticInnerClass = new Outer02.StaticInnerClass();
        staticInnerClass.test();
    }
}

class Outer02{
    private int a=6;
    private static String b = "hahah";

    public void tttt() {
        StaticInnerClass aClass = new StaticInnerClass();
    }
    //静态内部类
    static class StaticInnerClass{
        int c = 8;
        String d="hello";

        public void test() {
            //System.out.println(a);//静态内部类不能调用外部类的非静态属性
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }
}
