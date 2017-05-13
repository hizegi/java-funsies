package com.christineyi;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Button btnPrint = new Button("print");



    public static void main(String[] args) {
//	    Gearbox mcLaren = new Gearbox(6);
////	    Gearbox.Gear first = mcLaren.new Gear(1, 1.3);
////	    Gearbox.Gear second = mcLaren.new Gear(2, 15.4);
////        System.out.println(first.driveSpeed(1000));
//
////        mcLaren.addGear(1, 5.3);
////        mcLaren.addGear(2, 10.6);
////        mcLaren.addGear(3, 15.9);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));

        //this is an example of a local class:
        //an inner class defined in a scope block
//        class ClickListener implements Button.OnClickListener{
//            public ClickListener() {
//                System.out.println("I've been attached.");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked.");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        //anonymous class. we used the new Button.OnclickListener
        //with no name, because it was  implemented there in the brackets
        //override the onClick to make sure it implemented interface correctly
        //no name, declared in the expression passed as a parameter
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("Title was clicked.");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            System.out.println("Press 1 to Click.");
            int action = scanner.nextInt();
            switch(action){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
