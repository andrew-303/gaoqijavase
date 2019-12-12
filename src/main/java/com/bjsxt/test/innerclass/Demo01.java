package com.bjsxt.test.innerclass;

public class Demo01 {

    //静态内部类
    private static class StaticInnerClass{

    }

    //成员内部类
    private class FieldInnerClass{

    }

    //方法内部类
    public void TestInerClass(){

        //方法内部类
        class methodInnerClass{

        }


        //匿名内部类
        Runnable runnable = new Runnable() {

            @Override
            public void run() {

            }
        };
    }

}
