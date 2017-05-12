package com.christineyi;

import java.util.ArrayList;

/**
 * Created by Christine on 5/11/17.
 */
public class Bank {

    private String name;
    private ArrayList<Branch> bankBranch;

    public Bank(String name) {
        this.name = name;
        this.bankBranch = new ArrayList<Branch>();
    }

    //add branch. check to see if it exists
    public boolean addBranch(String branchName){
        if(findBranch(branchName) != null){
            System.out.println("Branch " + branchName + " already exists.");
            return false;
        }

        this.bankBranch.add(new Branch(branchName));
        System.out.println("Branch " + branchName + " has been created!");
        return true;
    }

    //add new customer
    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null){
            return foundBranch.newCustomer(customerName, initialAmount);
        }
        System.out.println("Bank.addCustomer(): Customer could not be added.");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        //test to see if branch exists
        Branch foundBranch = findBranch(branchName);
        if(foundBranch != null){
            return foundBranch.addCustomerTransaction(customerName, amount);
        }
        System.out.println("Bank.addCustomerTransaction(): Transaction could not be added.");
        return false;
    }


    public Branch findBranch(String branchName){
        for(int i = 0; i < this.bankBranch.size(); i++){
            Branch currentBranch = this.bankBranch.get(i);
            if(currentBranch.getName().equals(branchName)){
                System.out.println("Found the branch!");
                return currentBranch;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBankBranch() {
        return bankBranch;
    }


    public boolean listOfCustomers(String branchName, boolean showTransactions){
        System.out.println("Heey hey hey");
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getMyCustomers();

            for (int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println((i + 1) + "Customer " + branchCustomer.getName());
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransaction();
                    for(int j = 0; j < transactions.size(); j++){
                        System.out.println((j + 1) + " Transaction amount: $" + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            System.out.println("Something went wrong :(");
            return false;
        }
    }
}
