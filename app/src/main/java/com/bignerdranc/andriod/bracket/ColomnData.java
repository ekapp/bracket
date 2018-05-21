package com.bignerdranc.andriod.bracket;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by mcsuser on 5/20/18.
 */

public class ColomnData implements Serializable {

    public ColomnData(ArrayList<MatchData> matches) {
        this.matches = matches;
    }

    private ArrayList<MatchData> matches;

    public void setMatches(ArrayList<MatchData> matches) {
        this.matches = matches;
    }

    public ArrayList<MatchData> getMatches() {
        return matches;
    }
}