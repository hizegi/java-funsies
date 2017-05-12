package com.christineyi;

import java.util.ArrayList;

/**
 * Created by Christine on 5/11/17.
 */
public class Customer {

    private String name;
    ArrayList<Double> transaction;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(initialTransaction);
    }

    public void addTransaction(double transactionAmount){
        this.transaction.add(transactionAmount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

//    public static Customer(String name, )
}
