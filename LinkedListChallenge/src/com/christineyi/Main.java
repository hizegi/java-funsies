package com.christineyi;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //create albums and songs
        Album album = new Album("Weezer","Pinkerton");
        album.addSongToAlbum("Getchoo", 2.70);
        album.addSongToAlbum("No Other One", 3.02);
        album.addSongToAlbum("Why Bother?", 4.53);
        album.addSongToAlbum("Across the Sea", 5.12);

        Album album2 = new Album("Weezer", "Blue");
        album2.addSongToAlbum("My Name is Jonas", 3.40);
        album2.addSongToAlbum("No One Else", 3.25);
        album2.addSongToAlbum("Buddy Holly", 2.70);
        album2.addSongToAlbum("Say It Ain't So", 4.23);

        //create a ArrayList of Albums = Library
        ArrayList<Album> library = new ArrayList<Album>();
        library.add(album);
        library.add(album2);

        Playlist playlist1 = new Playlist("Morning Jamz");
        playlist1.addSongToPlaylist("No One Else", library);
        playlist1.addSongToPlaylist("Say It Ain't So", library);
        playlist1.addSongToPlaylist("Why Bother?", library);
        playlist1.addSongToPlaylist("No Other One", library);


        control(playlist1.getPlaylistSongs());
    }

    private static void control(LinkedList playlist){

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();

        //check to see if playlist is empty
        if(playlist.isEmpty()){
            System.out.println("This playlist has no songs.");
            return;
        } else {
            System.out.println("Now playing: " + listIterator.next());
            printMenu();
        }

        while(!quit){
            String action = scanner.nextLine();
            switch(action){
                case "quit":
                    System.out.println("Quitting song play.");
                    quit = true;
                    break;
                case "next":
                    //play next song,
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    //check to see if there is a next song
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing: " + listIterator.next().getTitle());
                    } else {
                        System.out.println("The playlist has ended.");
                        goingForward = false;
                    }
                    break;
                case "previous":
                    //play the previous song
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    //check to see if there's a previous song
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing: " + listIterator.previous().getTitle());
                    } else {
                        System.out.println("This is the start of the playlist.");
                        goingForward = true;
                    }
                    break;
                case "remove song":
                    listIterator.remove();
                    System.out.println("Removing song.");
                    //make sure there's a next available song
                    if(listIterator.hasNext()){
                        System.out.println("Now playing: " + listIterator.next().getTitle());
                    } else if(listIterator.hasPrevious()) {
                        System.out.println("Now playing: " + listIterator.previous().getTitle());
                    }
                    break;
                case "tracklist":
                    printPlaylist(playlist);
                case "menu":
                    //Print menu options
                    printMenu();
                    break;
            }
        }
    }

    //print menu options
    private static void printMenu(){
        System.out.println("Playlist options: Press ");
        System.out.println("\tquit - quit the application");
        System.out.println("\tnext - play next song");
        System.out.println("\tprevious - play previous song");
        System.out.println("\tremove song - delete song from playlist");
        System.out.println("\ttracklist - show all songs on playlist");
        System.out.println("\tmenu - view menu options");
    }

    //print out playlist tracklist
    private static void printPlaylist(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        int songNumber = 1;
        System.out.println("=====================");
        while(iterator.hasNext()){
            System.out.println(songNumber + ". " + iterator.next().getTitle());
            songNumber += 1;
        }
        System.out.println("=====================");
    }

}
