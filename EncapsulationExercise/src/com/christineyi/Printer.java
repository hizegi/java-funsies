package com.christineyi;

/**
 * Created by Christine on 5/10/17.
 */
public class Printer {
    private int tonerLevel;
    private int numOfPages;
    private int paperLevel;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel < -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
    }

    //refill toner if empty
    public int fillToner(int tonerAmount){
        if (this.tonerLevel > 0 && this.tonerLevel <= 100) {
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            System.out.println("Toner refilled to 100%");
            return this.tonerLevel;
        } else {
            System.out.println("(!) Toner levels are full.");
            return -1;
        }
    }

    //check ink levels
    private void checkInk(){
        if (this.tonerLevel == 0){
            System.out.println("Toner is empty. Refill toner.");
        }
    }

    //prints page
    public int printPage(int amount){
        int pagesToPrint = amount;
        if (this.isDuplex){
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode.");
        }
        this.numOfPages += pagesToPrint;
        return pagesToPrint;
    }

    public void refillPaper(){
        if (this.paperLevel >= 0 ) {
            this.paperLevel += 100;
            System.out.println("Paper has been refilled.");
        }
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getNumOfPages() {
        return this.numOfPages;
    }

    public int getPaperLevel() {
        return paperLevel;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
