package com.bjsxt.designpattern.bridge;

/**
 * 电脑类型维度-桥接模式
 */
public class Computer {

    //把另一个维度的接口当成一个属性使用
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        brand.sale();
    }
}

class Desktop extends Computer {

    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("卖桌面电脑");
    }
}

class Latop extends Computer {

    public Latop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("卖笔记本");
    }
}