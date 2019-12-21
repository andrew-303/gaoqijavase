package com.bjsxt.designpattern.builder;

public class BylAirshipBuilder implements AirshipBuilder{
    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("建造飞船轨道");
        return new OrbitalModule("byl牌飞船轨道");
    }

    @Override
    public Engine builderEngien() {
        System.out.println("建造飞船发动机");
        return new Engine("byl牌飞船发动机");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("建造飞船逃生舱");
        return new EscapeTower("byl牌逃生舱");
    }
}
