package com.kswr;

import java.util.HashSet;

public class Star extends HeavenlyBodyPlus{
    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.STAR);
    }
}
