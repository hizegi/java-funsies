package com.christineyi;

import java.util.ArrayList;

/**
 * Created by Christine on 5/11/17.
 */
public class Branch {

    private String name;
    private ArrayList<Customer> myCustomers;

    public Branch(String name) {
        this.name = name;
        this.myCustomers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getMyCustomers() {
        return this.myCustomers;
    }

    //create a new Customer
    //check if it exists, if it does return.
    //if it doesn't, create a new branch

    //check if it exists by name
    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) != null){
            System.out.println(customerName + " is already a customer at this branch.");
            return false;
        }

        this.myCustomers.add(new Customer(customerName, initialAmount));
        System.out.println(customerName + " has been added to the branch " + this.getName());
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    //find customer by name, return Customer
    //only used within this class
    private Customer findCustomer(String customerName){
        for(int i = 0; i < this.myCustomers.size(); i++){
            Customer checkedCustomer = this.myCustomers.get(i);
            if(this.myCustomers.get(i).getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

}
