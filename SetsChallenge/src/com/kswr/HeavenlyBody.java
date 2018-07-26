package com.kswr;

import java.util.HashSet;
import java.util.Set;

enum BodyType {
    MOON, STAR, PLANET, DWARF_PLANET, COMET, ASTEROID
}

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyType bodyType;

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public String getName() {
        return name;
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            if (theObject.bodyType.equals(this.bodyType)){
                return theObject.name.equals(this.name);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        System.out.println("hashCode() called");
        return this.name.hashCode() + 57;
    }

    @Override
    public String toString() {
        return this.bodyType + " " + this.getName() + ", orbital period: " + this.getOrbitalPeriod();
    }
}
