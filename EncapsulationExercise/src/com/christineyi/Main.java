package com.christineyi;

public class Main {

    public static void main(String[] args) {
//	    Printer hp = new Printer(100, 5, false);
//
//	    hp.printPage(5);
//	    hp.refillPaper();
//
//
//        System.out.println("Printer Status: " +
//                "Toner remaining: " + hp.getTonerLevel() +
//               "Sheets of paper remaining: " + hp.getPaperLevel()
//        );
        Printer hp = new Printer(50, false);
        System.out.println("Inital page count = " + hp.getNumOfPages());
        int pagesPrinted = hp.printPage(4);
        System.out.println("Pages printed was: " + pagesPrinted + " new total print count for printer = " + hp.getNumOfPages());
        pagesPrinted = hp.printPage(2);
        System.out.println("Pages printed was: " + pagesPrinted + " new total print count for printer = " + hp.getNumOfPages());
    }
}
