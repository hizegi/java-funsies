package com.christineyi;

import java.util.ArrayList;

/**
 * Created by Christine on 5/15/17.
 */

//instantiating a class, the T is automatically replaced by the real Type
//any type Player or   of Player
//want to compare team to another team of type T > specifying
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int tied = 0;
    int lost = 0;

    //passing in generic of type Player
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //At compile time, Java doesn't know what type T is, so we can cast Player type in this method
    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already on the team.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            won++;
            message = " beat ";
        } else if (ourScore == theirScore){
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        //update team's result
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        //if the currentTeam's ranking is higher that the team passed, return -1
        if(this.ranking() > team.ranking()){
            return -1;

        } else if (this.ranking() < team.ranking()){
            //the current Team has less points than the team passed
            return 1;
        } else {
            //the rankings are the same
            return 0;
        }
    }
}
