package com.christineyi;

/**
 * Created by Christine on 5/13/17.
 */
public abstract class ListItem {
    //
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    //returns a reference to the next Item in  the list
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    //sets reference to the previous item in the list
    abstract ListItem setPrevious(ListItem item);
    //compares object to whatever is passed
    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

