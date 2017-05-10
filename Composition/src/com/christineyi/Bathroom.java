package com.christineyi;

/**
 * Created by Christine on 5/10/17.
 */
public class Bathroom {

    private boolean hasShower;
    private int areaSquareFeet;
    private int numSinks;

    public Bathroom(boolean hasShower, int areaSquareFeet, int numSinks) {
        this.hasShower = hasShower;
        this.areaSquareFeet = areaSquareFeet;
        this.numSinks = numSinks;
    }

    public void turnSinkOn(String temp){
        if(temp == "hot"){
            hotWater();
        } else if (temp == "cold"){
            coldWater();
        } else {
            System.out.println("Choose hot or cold.");
        }
    }

    private void hotWater(){
        System.out.println("Bathroom.hotWater() called. Water is hot.");
    }

    private void coldWater(){
        System.out.println("Bathroom.coldWater() called. Water is cold.");
    }
}
