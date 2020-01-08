package com.bjsxt.designpattern.decorator;

/**
 * 装饰模式
 */

/**
 * 抽象构建
 */
public interface Icar {
    void move();
}

/**
 * 具体构建(真实对象)
 */
class Car implements Icar {

    @Override
    public void move() {
        System.out.println("车在陆地上跑！");
    }
}

/**
 * Decorator装饰角色
 */
class SuperCar implements Icar {

    protected Icar icar;

    public SuperCar(Icar icar) {
        this.icar = icar;
    }

    @Override
    public void move() {
        icar.move();
    }
}

class FlyCar extends SuperCar {

    public FlyCar(Icar icar) {
        super(icar);
    }

    public void fly() {
        System.out.println("天上飞");
    }
    @Override
    public void move() {
        super.move();
        fly();
    }
}

class WaterCar extends SuperCar {

    public WaterCar(Icar icar) {
        super(icar);
    }

    public void water() {
        System.out.println("水上漂");
    }

    @Override
    public void move() {
        super.move();
        water();
    }
}