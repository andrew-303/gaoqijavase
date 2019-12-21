package com.bjsxt.designpattern.builder;

public class BylAirshipDirector implements AirShipDirector{

    private AirshipBuilder builder;

    public BylAirshipDirector(AirshipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public Airship directorAriship() {
        Engine engine = builder.builderEngien();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();
        EscapeTower escapeTower = builder.builderEscapeTower();

        Airship airship = new Airship();
        airship.setEngine(engine);
        airship.setOrbitalModule(orbitalModule);
        airship.setEscapeTower(escapeTower);
        return airship;
    }
}
