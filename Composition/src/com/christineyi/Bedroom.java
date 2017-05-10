package com.christineyi;

/**
 * Created by Christine on 5/10/17.
 */
public class Bedroom {

    private Bed myBed;
    private Bathroom myBathroom;
    private Window myWindow;

    public Bedroom(Bed myBed, Bathroom myBathroom, Window myWindow) {
        this.myBed = myBed;
        this.myBathroom = myBathroom;
        this.myWindow = myWindow;
    }

    public void turnSinkOn(){
        myBathroom.turnSinkOn("hot");
    }
}
