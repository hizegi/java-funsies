package com.christineyi;

/**
 * Created by Christine on 5/9/17.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        System.out.println("PC.drawlogo() called!");
        monitor.drawPixel(1200, 50, "yellow");
    }

}
