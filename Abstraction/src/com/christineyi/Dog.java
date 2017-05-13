package com.christineyi;

/**
 * Created by Christine on 5/13/17.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    //these methods coming from Animal class
    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat.");
    }
}
