package com.christineyi;

/**
 * Created by Christine on 5/13/17.
 */
public interface NodeList {
    //root = head of the linked list
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
