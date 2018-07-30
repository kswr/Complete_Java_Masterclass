package com.kswr;

import java.util.*;

enum BodyType {STAR, PLANET, MOON};

public abstract class HeavenlyBodyPlus {
    private final String name;
    private final double orbitalPeriod;
    private final BodyType bodyType;
    private final Set<HeavenlyBodyPlus> satellites;


    public HeavenlyBodyPlus(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
        this.satellites = new HashSet();
    }

    private void addSatellite(HeavenlyBodyPlus satellite) {
        this.satellites.add(satellite);
    }

    public void addSatellites(HeavenlyBodyPlus... satellites) {
        for (HeavenlyBodyPlus hbp : satellites) {
            switch (this.getBodyType()) {
                case STAR:
                    if (hbp.getBodyType()==BodyType.PLANET) {
                        addSatellite(hbp);
                    }
                    break;
                case PLANET:
                    if (hbp.getBodyType()==BodyType.MOON) {
                        addSatellite(hbp);
                    }
                    break;
                case MOON:
                    if (hbp.getBodyType()==BodyType.MOON) {
                        addSatellite(hbp);
                    }
                    break;
            }
        }
    }


    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public Set<HeavenlyBodyPlus> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        if (o == null || o.getClass() != getClass()) return false;
        HeavenlyBodyPlus that = (HeavenlyBodyPlus) o;
        return Objects.equals(name, that.name) && bodyType == that.bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bodyType);
    }

    @Override
    public String toString() {
        String tempRet = (bodyType + " " + name + ", orbital period: " + orbitalPeriod);
        if (!satellites.isEmpty()) {
            tempRet += "\n\tSatellites: ";
        }
        for (HeavenlyBodyPlus hbp : satellites) {
            tempRet += ("\n\t" + hbp.toString());
        }
        return tempRet;
    }
}
