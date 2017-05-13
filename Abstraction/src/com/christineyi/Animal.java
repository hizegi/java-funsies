package com.christineyi;

/**
 * Created by Christine on 5/13/17.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //these abstract methods have to be implemented
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
