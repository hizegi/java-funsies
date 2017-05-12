package com.christineyi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank of America");

        bank.addBranch("New York City");
        bank.addBranch("New York City");

        bank.addCustomer("New York City", "Bob",100.00);
        bank.addCustomer("New York City", "Christine",5462188.87);
        bank.addCustomer("New York City", "Mike",3248.51);

        bank.addBranch("Chicago");
        bank.addCustomer("Chicago", "Bob", 30.00);

        bank.addCustomerTransaction("New York City", "Bob", 311.11);
        bank.addCustomerTransaction("New York City", "Bob", 10.22);
        bank.addCustomerTransaction("New York City", "Bob", 1.50);

        bank.listOfCustomers("New York City", true);
    }
}
