package com.bignerdranc.andriod.bracket;

import java.util.UUID;

/**
 * Created by mcsuser on 5/20/18.
 */

public class Team {

    public static Object getTeamName;
    private UUID mId;
    private String mTeamName;
//    private List<Player> mPlayers;

    public Team(){
        mId = UUID.randomUUID();
    }

    public UUID getId(){
        return mId;
    }

    public String getTeamName(){
        return mTeamName;
    }

    public void setTeamName(String teamName){
        mTeamName = teamName;
    }



//    public void addPlayer(Player player){
//        mPlayers.add(player);
//    }


}
