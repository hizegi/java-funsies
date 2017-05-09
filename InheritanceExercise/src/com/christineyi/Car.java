package com.christineyi;

/**
 * Created by Christine on 5/9/17.
 */
public class Car extends Vehicle {

    private int wheels;
    private int brakes;
    private int cupholders;
    private String color;

    public Car(int doors, String engine, int wheels, int brakes, int cupholders, String color ) {
        super(4, "super good");
        this.wheels = wheels;
        this.brakes = brakes;
        this.cupholders = cupholders;
        this.color = color;
    }

    public void honkCar(){
        System.out.println("Car.honkCar()");
    }

    public int getWheels() {
        System.out.println("Car class has " + wheels + " wheels.");
        return wheels;
    }

    public int getBrakes() {
        System.out.println("Car class has " + brakes + " brakes.");
        return brakes;
    }

    public int getCupholders() {
        System.out.println("Car class has " + cupholders + " cupholders.");
        return cupholders;
    }

    public String getColor() {
        System.out.println("Car class has " + color + " color.");
        return color;
    }

    @Override
    public void
    move(int speed) {
        System.out.println("Car.move() has been called.");
        super.move(speed);
    }
}
