package com.christineyi;

import javafx.beans.binding.When;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //When you need to store common primitive data types
        //in ArrayLists or pass them as parameters using objects
        // Autoboxing + Unboxing
        // 1 for each primitive type

        Integer integer = new Integer(54);
        Double myDouble = new Double(1.44);

        //Autoboxing.. convert primitive type to object wrapper
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 0; i <= 10; i++){
          myArray.add(Integer.valueOf(i));
        }

        //unboxing take it from the object wrapper and convert it back to primitive type
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " --> " + myArray.get(i).intValue());
        }

        //Java issues a shortcut and handle autoboxing and unboxing
        Integer myIntValue = 56;
        //At compile time Java runs it like this:
        //Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue;
        // Again, Java runs it like this at compile time:
        // int myInt = myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubleValues.add(dbl);
            //myDoubleValues.add(Double.valueOf(dbl)); <-- what Java runs (Autoboxing)
        }

        for (int i = 0; i < myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            //double value = myDoubleValues.get(i).doubleValue() <--what Java runs (Unboxing)
            System.out.println(i + " --> " + value);
        }



    }
}
