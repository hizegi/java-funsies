package com.christineyi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christine on 5/13/17.
 */
public class Player implements ISave {

    private String playerName;
    private int hitPoints;
    private int playerScore;
    private int level;

    public Player(String playerName, int hitPoints, int playerScore, int level) {
        this.playerName = playerName;
        this.hitPoints = hitPoints;
        this.playerScore = playerScore;
        this.level = level;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public List<String> save() {
        List<String> values = new ArrayList<String>();

        values.add(0, this.playerName);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.level);
        values.add(3, "" + this.playerScore);
        return values;
    }

    @Override
    public void read(List<String> array) {

        //test the list
        if(array != null && array.size() > 0){
            this.playerName = array.get(0);
            this.hitPoints = Integer.parseInt(array.get(1));
            this.level = Integer.parseInt(array.get(2));
            this.playerScore = Integer.parseInt(array.get(3));
        }

    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", hitPoints=" + hitPoints +
                ", playerScore=" + playerScore +
                ", level=" + level +
                '}';
    }
}
