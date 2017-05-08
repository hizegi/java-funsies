package com.christineyi;

/**
 * Created by Christine on 5/8/17.
 */
public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this(2, 2.5, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public Account(int number, double balance, String customerName, String email, String phoneNumber ) {
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int number){
        this.accountNumber = number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String name){
        this.customerName = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String number){
        this.phoneNumber = number;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void deposit(int funds){
        this.balance += funds;
        System.out.println(funds + " has been deposited. Your balance is now " + this.balance);
    }

    public void withdraw(int funds){
        if (funds <= 0 || balance < funds){
            System.out.println("Not enough funds to withdraw " + funds + ". Your balance is " + this.balance);
        } else {
            this.balance -= funds;
            System.out.println(funds + " has been withdrawn. Your balance is now " + this.balance);
        }
    }
}
