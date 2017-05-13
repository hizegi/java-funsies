package com.christineyi;

/**
 * Created by Christine on 5/13/17.
 */
public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing: " + phoneNumber + " on deskphone.");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == this.myNumber){
            System.out.println("Riiiiing riiiing");
        } else {
            isRinging = false;
        }

        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
