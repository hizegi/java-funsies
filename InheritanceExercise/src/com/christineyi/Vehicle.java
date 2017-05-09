package com.christineyi;

/**
 * Created by Christine on 5/8/17.
 */
public class Vehicle {

    private int doors;
    private String engine;

    public Vehicle(int doors, String engine) {
        this.doors = doors;
        this.engine = engine;
    }

    public void makeSound(){
        System.out.println("Honk honk.");
    }

    public void move(int speed){
        System.out.println("Vehicle.move() called. Vehicle is moving at " + speed + " speed.");
    }

    public void handSteering(){
        System.out.println("Vehicle.handSteering() called.");
    }

    public int getDoors() {
        System.out.println("Vehicle.getDoors() called. Vehicle has " + doors + " doors.");
        return doors;
    }

    public String getEngine() {
        System.out.println("Vehicle.getEngine() called. Vehicle has a " + engine + " engine.");
        return engine;
    }
}
