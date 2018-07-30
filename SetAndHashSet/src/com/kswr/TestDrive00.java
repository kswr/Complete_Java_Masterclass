package com.kswr;

import java.util.*;

public class TestDrive00 {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        addPlanet("Mercury", 88, solarSystem, planets);
        addPlanet("Venus", 225, solarSystem, planets);
        addPlanet("Earth", 365, solarSystem, planets);
        addMoon("Moon", 27, solarSystem, solarSystem.get("Earth"));
        addPlanet("Pluto", 842, solarSystem, planets);
//        addMoon("Moon", 27, solarSystem, solarSystem.get("Mars"));

        System.out.println("===================");
        System.out.println("printSet");
        printSet(planets);
        System.out.println("===================");
        System.out.println("printMap");
        printMap(solarSystem);

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody heavenlyBody : planets) {
            moons.addAll(heavenlyBody.getSatellites());
        }
        System.out.println("===================");
        System.out.println("Print moons");
        printSet(moons);

        Object o = new Object();
        o.equals(o);
        "pluto".equals("pluto");


    }

    public static void addPlanet(String name, double orbitalPeriod, Map solarSystem, Set planets) {
        HeavenlyBody temp = new HeavenlyBody(name, orbitalPeriod);
        solarSystem.put(name, temp);
        planets.add(temp);
        System.out.println("Planet " + name + " added");
    }
    public static void addMoon(String name, double orbitalPeriod, Map solarSystem, HeavenlyBody planet) {
        HeavenlyBody temp = new HeavenlyBody(name, orbitalPeriod);
        solarSystem.put(name, temp);
        try {
            planet.addMoon(temp);
            System.out.println("Moon " + name + " added to planet " + planet.getName());
        } catch (Exception e) {
            System.out.println("Planet not found");
        }
    }
    public static void printSet(Set<HeavenlyBody> set) {
        for (HeavenlyBody heavenlyBody : set) {
            System.out.println(heavenlyBody.getName());
        }
    }
    public static void printMap(Map<String, HeavenlyBody> map) {
        for (String string : map.keySet()) {
            System.out.println(string + " : " + map.get(string).getOrbitalPeriod());
        }
    }
}
