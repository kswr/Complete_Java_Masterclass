package com.kswr;

public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        if (satellite.getBodyType()==BodyType.MOON) {
            return super.addSatellite(satellite);
        } else {
            return false;
        }
    }
}
