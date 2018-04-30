package com.company;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()
        Album rock = new Album("Rock");
        Album metal = new Album("Metal");
        Album jazz = new Album("Jazz");
        rock.addNewSong("Highway to hell", 340);
        rock.addNewSong("Wake me up when september ends", 150);
        rock.addNewSong("Crazy train", 300);
        rock.addNewSong("Californication", 200);
        rock.addNewSong("Boulevard of broken dreams", 120);
        rock.addNewSong("Land of confusion", 120);
        metal.addNewSong("Dunkelheid", 600);
        metal.addNewSong("Mother north", 550);
        metal.addNewSong("Jesu dod", 700);
        metal.addNewSong("Where shadows forever reign", 400);
        metal.addNewSong("Prometheus", 350);
        jazz.addNewSong("Yellow is the colour", 400);
        jazz.addNewSong("Some other song", 300);
        jazz.addNewSong("Some other song", 300);
        jazz.addNewSong("Yet another song", 400);

        Playlist playlist1 = new Playlist("Playlist 1");
        playlist1.addSong(rock, "Highway to hell");
        playlist1.addSong(rock, "Highway to hell");
        playlist1.addSong(metal, "Jesu dod");
        playlist1.addSong(metal, "Prometheus");
        playlist1.addSong(jazz, "Some other song");
        playlist1.addSong(jazz, "Song that does not exists");

        menu(playlist1);


    }

    public static void menu(Playlist playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean goingforward = true;
        boolean quit = false;
        ListIterator<Song> listIterator = playlist.getSongs().listIterator();
        System.out.println("Now playing " + listIterator.next().getTitle());
        printOptions();
        while (!quit) {
//            System.out.println("Press 5 to print options");
            int selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection) {
                case 0:
                    System.out.println("Quiting playlist");
                    quit = true;
                    break;
                case 1:
                    if (!goingforward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                            goingforward = true;
                        }
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getTitle());
                        break;
                    } else {
                        System.out.println("Reached end of the playlist");
                        break;
                    }
                case 2:
                    if (goingforward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            goingforward = false;
                        }
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                        break;
                    } else {
                        System.out.println("This is beginning of the playlist");
                        break;
                    }
                case 3:
                    if (goingforward) {
                        System.out.println("Now playing " + listIterator.previous().getTitle());
                        goingforward = false;
                        break;
                    }
                    if (!goingforward) {
                        System.out.println("Now playing " + listIterator.next().getTitle());
                        goingforward = true;
                        break;
                    }
                case 4:
                    playlist.printPlaylist();
                    break;
                case 5:
                    printOptions();
                    break;
                case 6:
                    if(playlist.getSongs().size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().getTitle());
                        }else {
                            System.out.println("Now playing " + listIterator.previous().getTitle());
                        }
                    }
                    break;
            }
        }
    }
    public static void printOptions() {
        System.out.println("Insert your selection\n" +
                "press:\n" +
                "0 - To quit playlist\n" +
                "1 - To play next song\n" +
                "2 - To play previous song\n" +
                "3 - Replay (loop)\n" +
                "4 - Print playlist\n" +
                "5 - To print options\n" +
                "6 - Remove song from playlist");
    }
}
