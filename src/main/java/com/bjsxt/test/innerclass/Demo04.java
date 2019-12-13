package com.bjsxt.test.innerclass;

public class Demo04 {

}

class Outer04{
    int b=6;
    public void test(){
        int a=3;
        //方法内部类
        class Inner{
           int c=9;
           void tt(){
               //System.out.println(a);  //不能引用一个不是final类型的局部变量
               System.out.println(b);
               System.out.println(c);
           }
        }
    }
}
