package com.christineyi;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Christine on 5/12/17.
 */
public class Playlist {
    private String playlistName;
    private LinkedList<Song> playlistSongs;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.playlistSongs = new LinkedList<Song>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public LinkedList<Song> getPlaylistSongs() {
        return playlistSongs;
    }

    //add a song to the playlist
    public boolean addSongToPlaylist(String songName, ArrayList<Album> library){
        //check to see if song exists in an album and add that song to the playlist
        for(int i = 0; i < library.size(); i++){
//            System.out.println("Library has " + library.size() + " albums.");
            Album album = library.get(i);
            for(int j = 0; j < album.getSonglist().size(); j++){
                Song song = album.getSonglist().get(j);
//                System.out.println("Each Album song: " + album.getSonglist().get(j).getTitle());
                if(song.getTitle().equals(songName)){
                    this.playlistSongs.add(song);
                    System.out.println(song.getTitle() + " has been added to playlist " + this.getPlaylistName());
                    return true;
                }
            }
        }
        System.out.println(songName + " does not exist in any album.");
        return false;
    }


}
