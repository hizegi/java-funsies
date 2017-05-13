package com.christineyi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player lux = new Player("Lux", 50, 1000, 30);
        System.out.println(lux.toString());
        saveObject(lux);

//
//        System.out.println(lux);
//        saveObject(lux);
//        loadObject(lux);
//        System.out.println(lux);

//        Monster nashor = new Monster("Baron Nashor", 1000, "poison");
//        System.out.println(nashor.toString());
//
//        nashor.setHealthPoints(200);
//        nashor.setName("Baron");
//        saveObject(nashor);
//        loadObject(nashor);
//        System.out.println(nashor);

        ISave monster = new Monster("Minion", 5,"swords");
        saveObject(monster);
        loadObject(monster);
        System.out.println(monster);
        System.out.println("Monster name" + ((Monster) monster).getName());

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose: \n" +
                "1 to enter a string \n" +
                "0 to quit"
        );

        while(!quit){
            System.out.println("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    // write a method that takes an object that implements the interface as a parameter and "saves" the values.
    //save any type of class
    public static void saveObject(ISave objectToISave){
//        System.out.println(objectToISave);
        for(int i = 0 ; i < objectToISave.save().size(); i++){
            System.out.println("Saving " + objectToISave.save().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISave objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
