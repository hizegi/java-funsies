package com.christineyi;

/**
 * Created by Christine on 5/8/17.
 */

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}
