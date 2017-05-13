package com.christineyi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christine on 5/13/17.
 */
public interface ISave {
    //return an ArrayList of values to be saved
    List<String> save();
    //populate object's fields from an ArrayList
    void read(List<String> array);


}
