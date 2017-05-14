package com.christineyi;

/**
 * Created by Christine on 5/13/17.
 */
public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }


    //Use strings as value even if it's defined as Object
    @Override
    int compareTo(ListItem item) {
        if(item != null){
            //String has compareTo(), returns 0 or -1
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
