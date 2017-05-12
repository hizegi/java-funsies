package com.christineyi;

import java.util.ArrayList;

/**
 * Created by Christine on 5/12/17.
 */
public class Album {

    private String albumName;
    private String artistName;
    private ArrayList<Song> songlist;

    public Album(String artistName, String albumName) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.songlist = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSonglist() {
        return this.songlist;
    }

    //add song to album
    public boolean addSongToAlbum(String songTitle, Double duration){
        Song song = new Song(songTitle, duration);
        //check to see if song exists
        if(findSong(song.getTitle()) >= 0){
            System.out.println("Song " + song.getTitle() + " already exists.");
            return false;
        }
        System.out.println("New song " + song.getTitle() + " has been added to " + getAlbumName());
        this.songlist.add(song);
        return true;
    }

    //find Song in album by song title
    private int findSong(String songTitle){
        for(int i = 0; i < this.songlist.size(); i++){
            Song song = songlist.get(i);
            if(song.getTitle().equals(songTitle)){
                return 1;
            }
        }
        return -1;
    }


    //print the albums songs
    public void printAlbum(){
        for(int i = 0; i < this.songlist.size(); i++){
            System.out.println((i + 1) + ". " + this.songlist.get(i).getTitle());
        }
    }



}
