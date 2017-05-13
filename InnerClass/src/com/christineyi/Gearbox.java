package com.christineyi;

import java.util.ArrayList;

/**
 * Created by Christine on 5/13/17.
 */
public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        //add individual gears to gearbox
        for (int i = 0; i < maxGears; i++){
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean isIn){
        this.clutchIsIn = isIn;
    }

    public void addGear(int gearNumber, double ratio){
        if (gearNumber > 0 && gearNumber <= this.maxGears){
            this.gears.add(new Gear(gearNumber, ratio));
        }
    }

    public void changeGear(int number){
        if(this.clutchIsIn && number > 0 && number < this.gears.size()){
            this.currentGear = number;
            System.out.println("Gear has changed to " + number);
        } else {
            System.out.println("Griiiind.");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if (this.clutchIsIn){
            System.out.println("Scream!!");
            return 0.0;
        }

        return revs * this.gears.get(this.currentGear).getRatio();
    }


    //this is the inner class

    //instances of the Gear class have got access to all the methods and fields of the outer class,
    //even those marked as private
    // this.currentGear refers to the inner class, not referring to top-level class
    //this refers to the class you're in
    private class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs * (this.ratio );

        }

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
