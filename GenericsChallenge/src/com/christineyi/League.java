package com.christineyi;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Christine on 5/15/17.
 */
public class League<T extends Team> {
    //add team to the list
    //store a list of teams that belong to the league
    //print out teams in order

    public String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    //add team to league
    public boolean addTeam(T team){
        if(this.teams.contains(team)){
            System.out.println(team.getName() + " is already on the league.");
            return false;
        } else {
            this.teams.add(team);
            System.out.println(team.getName() + " has been added to " + this.name);
            return true;
        }
    }

    public void showLeagueTable(){
        Collections.sort(this.teams);
        //for every Team in teams
        for(T t: this.teams){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }


}
