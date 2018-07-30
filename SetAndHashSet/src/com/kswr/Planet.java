package com.kswr;

import java.util.HashSet;

public class Planet extends HeavenlyBodyPlus{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }
}
