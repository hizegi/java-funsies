package com.christineyi;

/**
 * Created by Christine on 5/13/17.
 */
public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        //check to see if list is empty
        if(this.root == null){
            //list is empty, so item becomes the head of the list
            this.root = newItem;
            return true;
        }

        //compare from the head of the list
        ListItem currentItem = this.root;
        while(currentItem != null){
            //checks if strings are equal
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0){
                //newItem is greater. Move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    //you've reached the end of the list, insert here
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0){
                //newItem is less, insert before
                if(currentItem.previous() != null){
                    //insert new item before current item
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                ///they are equal
                System.out.println(newItem.getValue() + " is already present. Not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        //set the previous link to point to where our item to be deleted points
        if(item != null){
            System.out.println("Deleting item " + item.getValue() );
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison == 0){
                //found the item to delete
                //if it's only one entry and this is the root record
                //if this is the very first (the head)
                if(currentItem == this.root){
                    //set root to point to next list item, what root is pointing to
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        //for the next item, points to the current previous pointer
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0){
                //haven't reached the point in the linked list
                currentItem = currentItem.next();
            } else {
                //we got passed the point where we could have deleted
                //so the item is not in the list
                return false;
            }
        }

        //we have reached the end of the list without finding item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        //check if list is empty
        if(root == null){
            System.out.println("This list is empty.");
        } else {
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
