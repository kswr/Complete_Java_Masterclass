package com.kswr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Challenge00 {
    Map<Planet, String> planets = new HashMap<>();
    Set<HeavenlyBodyPlus> solarSystem = new HashSet<>();

    public static void main(String[] args) {
        Star sun = new Star("Sun", 0);
        Planet earth = new Planet("Earth", 365);
        Planet mars = new Planet("Mars", 400);
        Planet venus = new Planet("Venus", 666);
        Planet mercury = new Planet("Mercury", 240);
        Moon moon = new Moon("Moon", 34);
        earth.addSatellites(moon);
        sun.addSatellites(earth, mars,venus, mercury);
        System.out.println(sun);


    }

    public static void addPlanets(HashMap<Planet, String> planetsMap, Planet... planets) {
        for (Planet planet : planets) {
            planetsMap.put(planet, planet.getName());
        }
    }

    public static void addBody(HashSet<HeavenlyBodyPlus> solarSystem, HeavenlyBodyPlus... bodies) {
        for (HeavenlyBodyPlus hbp : bodies) {
            solarSystem.add(hbp);
        }
    }
}
