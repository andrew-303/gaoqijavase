package com.bjsxt.designpattern.factory.abstractfactory;

/**
 * 汽车工厂
 */
public interface CarFactory {
    Engine createEngien();
    Seat createSeat();
    Tyre createTyre();
}
