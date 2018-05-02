package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songList;

    private class SongList {
        private List<Song> songs = new ArrayList<>();

        public SongList() {
        }

        public void addSong(Song song) {
            this.songs.add(song);
        }

        public int findSong(String title) {
            int tempId = -1;
            for (Song song : this.songs) {
                if(title == song.getTitle()) {
                    tempId = songs.indexOf(song);
                }
            }
            return tempId;
        }

        public int findSong(Song songToFind) {
            return findSong(songToFind.getTitle());
        }
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songList.addSong(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for(Song checkedSong: this.songList.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;
        if((index >0) && (index <= this.songList.songs.size())) {
            playList.add(this.songList.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }



















}
