package com.christineyi;

/**
 * Created by Christine on 5/9/17.
 */
public class Porsche extends Car {

    private String model;
    private int year;
    private double price;

    public Porsche(int doors, String engine, int wheels, int brakes, int cupholders, String color, String model, int year, double price) {
        super(doors, engine, wheels, brakes, cupholders, color);
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        System.out.println("Porsche class model is " + model);
        return model;
    }

    public int getYear() {
        System.out.println("Porsche class year manufactured is " + year);
        return year;
    }

    public double getPrice() {
        System.out.println("Porsche class price is : " + price);
        return price;
    }

    @Override
    public void move(int speed){
        System.out.println("Porsche.move() has been called.");
    }
}
