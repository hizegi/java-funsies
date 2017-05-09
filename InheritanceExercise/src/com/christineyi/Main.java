package com.christineyi;

public class Main {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(4, "excellengine");
        car.getDoors();
        car.getEngine();
        car.handSteering();
        car.makeSound();
        car.move(50);

        Car porsche = new Car(4, "yes",4,4,4,"black");
        porsche.getBrakes();
        porsche.move(20);

        Porsche simon = new Porsche(2, "golden", 4,4,40, "blue", "super cool", 2017, 500000.0);
        simon.getModel();
        simon.getPrice();
        simon.makeSound();

    }
}
