package com.christineyi;

/**
 * Created by Christine on 5/10/17.
 */
public class Window {

    private int numWindows;
    private String windowType;
    private boolean hasCurtain;
    private boolean isOpen;

    public Window(int numWindows, String windowType, boolean hasCurtain) {
        this.numWindows = numWindows;
        this.windowType = windowType;
        this.hasCurtain = hasCurtain;
    }

    public void openWindow(){
        if (isOpen){
            System.out.println("Window is already open.");
        } else {
            isOpen = !isOpen;
            System.out.println("Window is closed.");
        }

    }
}
