package com.christineyi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christine on 5/13/17.
 */
public class Monster implements ISave {

    private String name;
    private int healthPoints;
    private String weapon;

    public Monster(String name, int healthPoints, String weapon) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.healthPoints);
        values.add(2, "" + this.weapon);
        return values;
    }

    @Override
    public void read(List<String> array) {
        //test the list
        if(array != null && array.size() > 0){
            this.name = array.get(0);
            this.healthPoints = Integer.parseInt(array.get(1));
            this.weapon = array.get(2);
        }
    }
}
