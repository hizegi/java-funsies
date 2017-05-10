package com.christineyi;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int velocity;
    private String name;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String startEngine(){
        System.out.println("Car.startEngine() called.");
        return "Car.startEngine() called. Engine starting...";
    }

    public int accelerate(int speed){
        this.velocity += speed;
        System.out.println("Car.accelerate() called. Car moving at " + this.velocity);
        return this.velocity;
    }

    public String brake(){
        this.velocity = 0;
        System.out.println("Car.brake() called. Car has stopped. Velocity " + this.velocity);
        return "Car.brake() called. Car has stopped.";
    }

}

class Benz extends Car{
    public Benz() {
        super("Mercedez Benz", 6);
    }


}

class StationWagon extends Car{
    private int velocity;

    public StationWagon() {
        super("Station Wagon", 6);
    }

    @Override
    public int accelerate(int speed) {
        this.velocity += speed * 0.5;
        System.out.println("Station Wagon is accelerating at: " + this.velocity);
        return this.velocity;
    }
}

class Tesla extends Car{
    private int velocity;

    public Tesla() {
        super("Tesla", 8);
    }

    @Override
    public int accelerate(int speed) {
        this.velocity += speed * 2;
        System.out.println("Mercedez is accelerating at: " + this.velocity);
        return this.velocity;
    }
}

public class Main {

    public static void main(String[] args) {
	    Car car = new Car("Base car", 8);
	    car.startEngine();
	    car.accelerate(12);
	    car.brake();

	    Benz benz = new Benz();
	    benz.startEngine();
	    benz.accelerate(4);
	    benz.brake();

        StationWagon sw = new StationWagon();
        sw.startEngine();
        sw.accelerate(100);
        sw.brake();

        Tesla tesla = new Tesla();
        tesla.startEngine();
        tesla.accelerate(50);
        tesla.brake();
    }
}
