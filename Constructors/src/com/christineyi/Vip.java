package com.christineyi;

/**
 * Created by Christine on 5/8/17.
 */
public class Vip {
    private String name;
    private double credit;
    private String email;

    public Vip(){
        this("default name", 100.00, "example@gmail.com");
        System.out.println("Empty Vip constructed");

    }

    public Vip(String name, double credit){
        this(name, credit, "2ndexample@gmail.com");
    }

    public Vip(String name, double credit, String email){
        this.name = name;
        this.credit = credit;
        this.email = email;

        System.out.println("New Vip customer: " + name);
        System.out.println("New Vip credit: " + credit);
        System.out.println("New Vip email: " + email);

    }

    public String getName() {
        return name;
    }

    public double getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }
}
