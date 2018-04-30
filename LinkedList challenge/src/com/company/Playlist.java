package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private String name;
    LinkedList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new LinkedList<>();
    }

    public boolean addSong(Song song) {
        if (this.songs.contains(song)) {
            System.out.println("Playlist already contains song " + song.getTitle());
            return false;
        } else {
            this.songs.add(song);
            return true;
        }
    }

    public boolean addSong(Album album, String title) {
        int songId = album.getSongId(title);
        if(songId == -1) {
            System.out.println("Song not found");
            return false;
        } else {
            if(this.getSongId(title) == -1) {
                this.songs.add(album.getSongs().get(songId));
                System.out.println("Song \"" + title + "\" from album \"" + album + "\" added to " + this.getName());
                return true;
            } else {
                System.out.println("Song already on the playlist");
                return false;
            }
        }
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public int getSongId(String name) {
        int tempId = -1;
        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getTitle().equals(name))
                tempId = i;
        }
        return tempId;
    }

    // handy for looking for duplicates, returns object, easier way to write for with array
    private Song findSong(String name) {
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(name)) {
                return checkedSong;
            }
        }
        return null;
    }

    public void printPlaylist() {
        Iterator<Song> iterator = this.songs.iterator();
        System.out.println("==============");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==============");
    }

//    public boolean removeSong(String name) {
//        ListIterator<Song> songListIterator = this.songs.listIterator();
//        int songId = getSongId(name);
//        songListIterator.remove();
//    }
}
