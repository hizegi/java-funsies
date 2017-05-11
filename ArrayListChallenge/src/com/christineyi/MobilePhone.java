package com.christineyi;

import java.util.ArrayList;

/**
 * Created by Christine on 5/11/17.
 */
public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    //construct a phone with a number and an ArrayList to store Contacts
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    //add a contact
    //checks to see if contact exists
    public boolean addContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file.");
            return false;
        }
        //add contact to ArrayList
        myContacts.add(contact);
        return true;
    }

    //modify contact
    //check if it's there
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + " is not found.");
            return false;
        }
        //if contact exists, set contact with (Index, Contact)
        myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    //remove contact


    //query contact.. find index of contact
    //by Contact object
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    //find index of contact by Name
    //loop through ArrayList and find matching names.
    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
}
