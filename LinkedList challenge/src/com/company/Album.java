package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(Song song) {
        if (getSongId(song.getTitle()) != -1) {
            System.out.println("Album already contains this song");
            return false;
        } else {
            this.songs.add(song);
            System.out.println("Song \"" + song.getTitle() + "\" added to the album \"" + this.name + "\"");
            return true;
        }
    }

    public boolean addNewSong(String title, int duration) {
        return addSong(new Song(title, duration));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public int getSongId(String title) {
        int tempId = -1;
        if (this.songs.size() == 0) {
            System.out.println("This album does not contain any songs");
        }
        for (int i = 0; i<this.songs.size(); i++) {
            if (this.songs.get(i).getTitle().equals(title)){
                tempId = i;
            }
        }
        return tempId;
    }


    @Override
    public String toString() {
        return this.getName();
    }
}
