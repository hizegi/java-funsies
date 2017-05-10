package com.christineyi;

/**
 * Created by Christine on 5/10/17.
 */
public class HealthyBurger extends Hamburger {
    private double basePrice;
    private double healthyToppingPrice;
    private double totalPrice;
    private Addition addition5 = null;
    private Addition addition6 = null;

    public HealthyBurger() {
        super("brown rye", "veggie");
        this.basePrice = 1.00;
    }

    //5 toppings
    public double addHealthyAddition(Addition e){
        this.addition5 = e;
        System.out.println("Toppings added! " + e.getName());
        this.healthyToppingPrice = this.basePrice + this.addition5.getPrice();
        return this.healthyToppingPrice;
    }

    //6 toppings
    public double addHealthyAddition(Addition e, Addition f){
        this.addition5 = e;
        this.addition6 = f;
        System.out.println("Toppings added! " + e.getName() +f.getName());
        this.healthyToppingPrice = this.basePrice + this.addition5.getPrice() +this.addition6.getPrice();
        return this.healthyToppingPrice;
    }

    @Override
    public double showHamburgerPrice(){
        double hamburgerPrice = super.showHamburgerPrice();
        hamburgerPrice += this.basePrice;
        hamburgerPrice += this.healthyToppingPrice;
        System.out.println("HealthyBurger base price: " + this.basePrice);
        if(this.addition5 != null){
            System.out.println("Healthy Burger Addition 5: " + addition5.getName() + " cost $" + addition5.getPrice());
        }
        if(this.addition6 != null){
            System.out.println("Healthy Burger Addition 6: " + addition6.getName() + " cost $" + addition6.getPrice());
        }
        System.out.println("Your Healthy Burger total is : $" + hamburgerPrice);
        return hamburgerPrice;
    }



}
