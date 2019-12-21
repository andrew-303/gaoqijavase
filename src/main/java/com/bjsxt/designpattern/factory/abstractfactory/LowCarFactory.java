package com.bjsxt.designpattern.factory.abstractfactory;

/**
 * 低端汽车工厂
 */
public class LowCarFactory implements CarFactory{
    @Override
    public Engine createEngien() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
