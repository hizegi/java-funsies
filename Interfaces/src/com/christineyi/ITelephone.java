package com.christineyi;

/**
 * Created by Christine on 5/13/17.
 */
public interface ITelephone {
    //define the actual methods in the interface
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

}
