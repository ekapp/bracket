package com.bignerdranc.andriod.bracket;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by mcsuser on 5/20/18.
 */

public class TeamLab {
    private static TeamLab sTeamLab;

    private List<Team> mTeams;

    public static TeamLab get(Context context){
        if (sTeamLab == null){
            sTeamLab = new TeamLab(context);
        }
        return sTeamLab;
    }

    private TeamLab(Context context){
        mTeams = new ArrayList<>();
        for (int i = 0; i<100; i++) {
            Team team = new Team();
            team.setTeamName("Team # " + i);
            mTeams.add(team);
        }

    }

    public List<Team> getTeams(){
        return mTeams;
    }

    public Team getTeam(UUID id){
        for (Team team : mTeams) {
            if (team.getId().equals(id)){
                return team;
            }
        }
        return null;
    }
}
