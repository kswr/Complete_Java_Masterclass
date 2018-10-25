package com.timbuchalka;

import java.io.*;
import java.util.*;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
//        FileWriter locfile = null;
//        try {
//            locfile = new FileWriter("locations.txt");
//            for (Location location : locations.values()) {
//                locfile.write(location.getLocationID() + ", " + location.getDescription() + "\n");
////                throw new IOException("test throw while writing");
//            }
//        } finally {
//            System.out.println("In finally block");
//            if (locfile != null) {
//                System.out.println("Attemting to close");
//                locfile.close();
//                System.out.println("Closed!");
//            }
//        }
//
//        try(FileWriter fileWriter = new FileWriter("locations.txt");
//        FileWriter dirFile = new FileWriter("directions.txt")) {
//            for (Location location : locations.values()) {
//                String temp = String.format("%d,%s\n", location.getLocationID(), location.getDescription());
//                fileWriter.write(temp);
//                for (String direction : location.getExits().keySet()) {
//                    dirFile.write(String.format("%s,%s,%s,\n", location.getLocationID(), direction, location.getExits().get(direction)));
//                }
//            }
//        }

        try(BufferedWriter locFile = new BufferedWriter(new FileWriter("locations.txt"));
        BufferedWriter dirFile = new BufferedWriter(new FileWriter("directions.txt"))) {
            for (Location location : locations.values()) {
                locFile.write(String.format("%s, %s\n", location.getLocationID(), location.getDescription()));
                for (String direction : location.getExits().keySet()) {
                    dirFile.write(String.format("%s,%s,%s,\n", location.getLocationID(), direction, location.getExits().get(direction)));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static {

        try(BufferedReader br = new BufferedReader(new FileReader("locations.txt"))) {
            String input = br.readLine();
            while (input!=null) {
                String[] line = input.split(",");
                int loc = Integer.parseInt(line[0]);
                String description = line[1];
                System.out.printf("Scanned location; id: %d, description: %s\n", loc, description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
                input = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader("directions.txt"))) {
            String input = br.readLine();
            while (input!=null) {
                String[] line = input.split(",");
                int id = Integer.parseInt(line[0]);
                String direction = line[1];
                int destination = Integer.parseInt(line[2]);
                Location location = locations.get(id);
                System.out.printf("Direction id: %d, direction: %s, destination: %d\n", id, direction, destination);
                location.addExit(direction, destination);
                input = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
