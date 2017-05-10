package com.christineyi;

/**
 * Created by Christine on 5/10/17.
 */
public class Hamburger {
    private double basePrice;
    private double totalPrice;
    private String rollType;
    private String meat;
    private Addition addition1 = null;
    private Addition addition2 = null;
    private Addition addition3 = null;
    private Addition addition4 = null;

    public Hamburger(String rollType, String meat) {
        this.basePrice = 1.00;
        this.rollType = rollType;
        this.meat = meat;
    }

    public double addAddition(Addition a){
        this.addition1 = a;
        System.out.println("Toppings added! " + a.getName());
        this.totalPrice = this.basePrice + this.addition1.getPrice();
        return this.totalPrice;
    }

    public double addAddition(Addition a, Addition b){
        this.addition1 = a;
        this.addition2 = b;
        System.out.println("Toppings added! " + a.getName() + b.getName());
        this.totalPrice = this.basePrice + this.addition1.getPrice() + this.addition2.getPrice();
        return this.totalPrice;
    }

    public double addAddition(Addition a, Addition b, Addition c){
        this.addition1 = a;
        this.addition2 = b;
        this.addition3 = c;
        System.out.println("Toppings added! " + a.getName() + b.getName() + c.getName());
        this.totalPrice = this.basePrice + this.addition1.getPrice() + this.addition2.getPrice() + this.addition3.getPrice();
        return this.totalPrice;
    }

    public double addAddition(Addition a, Addition b, Addition c, Addition d){
        this.addition1 = a;
        this.addition2 = b;
        this.addition3 = c;
        this.addition4 = d;
        System.out.println("Toppings added! " + a.getName() + b.getName() + c.getName() + d.getName());
        this.totalPrice = this.basePrice + this.addition1.getPrice() + this.addition2.getPrice() + this.addition3.getPrice() + this.addition4.getPrice();
        return this.totalPrice;
    }

    public double showHamburgerPrice(){
        System.out.println("Hamburger base price: " + this.basePrice);
        if(this.addition1 != null){
            System.out.println("Addition 1: " + addition1.getName() + " cost $" + addition1.getPrice());
        }
        if(this.addition2 != null){
            System.out.println("Addition 2: " + addition2.getName() + " cost $" + addition2.getPrice() );
        }
        if(this.addition3 != null){
            System.out.println("Addition 3: " + addition3.getName() + " cost $" + addition3.getPrice());
        }
        if(this.addition4 != null){
            System.out.println("Addition 4: " + addition4.getName() + " cost $" + addition4.getPrice());
        }
        System.out.println("Your total is : $" + this.totalPrice);
        return this.totalPrice;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }
}
