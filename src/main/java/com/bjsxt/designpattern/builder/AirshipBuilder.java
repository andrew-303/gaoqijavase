package com.bjsxt.designpattern.builder;

/**
 * 建造飞船组件
 */
public interface AirshipBuilder {

    OrbitalModule builderOrbitalModule();
    Engine builderEngien();
    EscapeTower builderEscapeTower();

}
