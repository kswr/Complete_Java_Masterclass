package com.kswr;

import java.util.HashSet;

public class Moon extends HeavenlyBodyPlus{
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.MOON);
    }
}
