package com.christineyi;

/**
 * Created by Christine on 5/13/17.
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Penguins don't fly too good..");
    }
}
