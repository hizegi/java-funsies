package com.christineyi;

/**
 * Created by Christine on 5/11/17.
 */
public class Contact {

    private String phoneNumber;
    private String name;

    public Contact(String name, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    //create a new contact record through constructor+
    //don't need to create a new object instance for this Contact class
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}
