package com.christineyi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        printArray(myArray);
        sortIntegers(myArray);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter in 5 integers.");
        int[] createArray = new int[number];
        for(int i = 0; i < createArray.length; i++){
            createArray[i] = scanner.nextInt();
        }
        return createArray;
    }

    public static void printArray(int[] array){
        System.out.println("printing Array");
        for(int i = 0; i < array.length; i++){
            System.out.println("Index " + i + ", value of " + array[i]);
        }
    }

//    public static int[] sortIntegers(int[] array){
//        for(int i = 0; i < array.length - 1; i++){
//            for (int j = 0; j < array.length - 1; j++){
//                //if i[0] < i[1] then i[0] = i[1] and i[1] = i[0]
//                if(array[j] < array [j + 1]){
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        printArray(array);
//        return array;
//    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        printArray(sortedArray);
        return sortedArray;
    }


}
