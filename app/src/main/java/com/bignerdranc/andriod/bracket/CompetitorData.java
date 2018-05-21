package com.bignerdranc.andriod.bracket;

import java.io.Serializable;

/**
 * Created by mcsuser on 5/20/18.
 */

public class CompetitorData implements Serializable {

    private String name;
    private String score;

    public CompetitorData(String name, String score) {
        this.name = name;
        this.score = score;
    }

    public CompetitorData(Object getTeamName) {
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}