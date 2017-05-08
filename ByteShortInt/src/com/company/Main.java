package com.company;

public class Main {
    public static void main(String[] args) {
        //for numbers 10-49 find the first 3 prime numbers
        int count = 0;
        for (int i = 10; i < 50; i++){
            if (isPrime(i) && count < 3){
                count++;
                System.out.println("Prime number " + i + " found! Total of " + count + " primes.");
            }
        }
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

//        for (int i = 2; i <= n/2; i++){
        for (int i = 2; i <= (long) Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }


}
