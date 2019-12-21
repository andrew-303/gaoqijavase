package com.bjsxt.designpattern.builder;

public class Client {
    public static void main(String[] args) {

        //建造者
        BylAirshipBuilder bylAirshipBuilder = new BylAirshipBuilder();
        //组装者
        BylAirshipDirector bylAirshipDirector = new BylAirshipDirector(bylAirshipBuilder);

        //组装出一艘飞船
        Airship airship = bylAirshipDirector.directorAriship();
        Engine engine = airship.getEngine();
        OrbitalModule orbitalModule = airship.getOrbitalModule();
        EscapeTower escapeTower = airship.getEscapeTower();

        System.out.println(engine.getName());
        System.out.println(orbitalModule.getName());
        System.out.println(escapeTower.getName());

    }
}
