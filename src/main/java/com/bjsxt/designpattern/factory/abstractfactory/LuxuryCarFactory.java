package com.bjsxt.designpattern.factory.abstractfactory;

/**
 * 高端汽车工厂
 */
public class LuxuryCarFactory implements CarFactory{
    @Override
    public Engine createEngien() {
        return new LaxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LaxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
