package com.christineyi;

public class Main {

    public static void main(String[] args) {
       int count = 0;
       int number = 5;
       int lastNumber = 20;
       while ((number <= lastNumber) && count < 5){
           if(isEvenNumber(number)){
               count++;
           };
           number++;
       }
        System.out.println("Total even numbers: " + count);
    }

    public static boolean isEvenNumber(int a){
        if (a % 2 == 0){
            System.out.println(a + " is even");
            return true;
        }
        System.out.println(a + " is odd.");
        return false;
    }
}
