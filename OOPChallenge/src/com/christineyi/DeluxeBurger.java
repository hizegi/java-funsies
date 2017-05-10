package com.christineyi;

/**
 * Created by Christine on 5/10/17.
 */
public class DeluxeBurger extends Hamburger{

    private String chips;
    private String drink;

    public DeluxeBurger(String chips, String drink) {
        super("sesame bun", "beef");
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public double showHamburgerPrice() {
        double hamburgerPrice = super.showHamburgerPrice();
        hamburgerPrice += 2.00;
        System.out.println("Deluxe burger with " + this.getRollType() + ", " + this.getMeat());
        System.out.println("Deluxe additions: " + this.getChips() + " and " + this.getDrink() + " for an extra $2");
        System.out.println("Deluxe total is $" + hamburgerPrice);
        return hamburgerPrice;
    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }
}
