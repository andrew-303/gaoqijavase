package com.bjsxt.test.innerclass;

public class Demo05 {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.test();

    }
}


class Outer05{
    public void test02(Car car){
        car.run();
    }

    //匿名内部类(接口式)
    public void test(){
        //定义了一个接口下面的实现类，这个实现类是没有名字的
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
            }
        };

        //匿名内部类，继承式写法
        Car car = new Car(){
            @Override
            public void run() {
                System.out.println("子类在跑");
            }
        };
        car.run();

        //参数式匿名内部类
        test02(new Car(){
            @Override
            public void run() {
                System.out.println("参数式匿名内部类，车在跑");
            }
        });
    }

}

class Car{
    public void run(){
        System.out.println("卡车在跑");
    }
}