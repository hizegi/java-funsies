package com.christineyi;

public class Main {

    public static void main(String[] args) {
        Hamburger burger = new Hamburger("wheat", "beef");
        Pickle pickle = new Pickle();
        Lettuce lettuce = new Lettuce();
        Tomato tomato = new Tomato();
        Cheese cheese = new Cheese();
        Avocado avocado = new Avocado();
        Bacon bacon = new Bacon();

//        burger.addAddition(bacon, avocado, pickle);
//        burger.showHamburgerPrice();
//
//        Hamburger burger2 = new Hamburger("wheat", "beef");
//        burger2.addAddition(cheese);
//        burger2.showHamburgerPrice();

//        HealthyBurger veggie = new HealthyBurger();
//        veggie.addAddition(bacon, pickle, lettuce, avocado);
//        veggie.addHealthyAddition(cheese, tomato);
//        veggie.showHamburgerPrice();

        DeluxeBurger deluxe = new DeluxeBurger("Sun Chips", "Diet Coke");
        deluxe.addAddition(bacon, lettuce, cheese);
        deluxe.showHamburgerPrice();
    }
}
