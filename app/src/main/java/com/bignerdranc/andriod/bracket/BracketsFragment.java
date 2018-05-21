package com.bignerdranc.andriod.bracket;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by mcsuser on 5/20/18.
 */

public class BracketsFragment extends Fragment {


    private BracketsSectionAdapter sectionAdapter;
    private ArrayList<ColomnData> sectionList;

    private TextView mTeamName;
    private Team mTeam;

    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_brackets,container,false);
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setData();
        //intialiseViewPagerAdapter();
    }

    private void setData() {
        sectionList = new ArrayList<>();
        ArrayList<MatchData> Colomn1matchesList = new ArrayList<>();
        ArrayList<MatchData> colomn2MatchesList = new ArrayList<>();
        ArrayList<MatchData> colomn3MatchesList = new ArrayList<>();
        CompetitorData competitorOne = new CompetitorData(Team.getTeamName);
        CompetitorData competitorTwo = new CompetitorData(Team.getTeamName);
        CompetitorData competitorThree = new CompetitorData(Team.getTeamName);
        CompetitorData competitorFour = new CompetitorData(Team.getTeamName);
        MatchData matchData1 = new MatchData(competitorOne, competitorTwo);
        MatchData matchData2 = new MatchData(competitorThree, competitorFour);
        Colomn1matchesList.add(matchData1);
        Colomn1matchesList.add(matchData2);
        ColomnData colomnData1 = new ColomnData(Colomn1matchesList);
        sectionList.add(colomnData1);


    }

    public BracketsColomnFragment getBracketsFragment(int position) {
        BracketsColomnFragment bracktsFrgmnt = null;
        if (getChildFragmentManager() != null) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            if (fragments != null) {
                for (Fragment fragment : fragments) {
                    if (fragment instanceof BracketsColomnFragment) {
                        bracktsFrgmnt = (BracketsColomnFragment) fragment;
                        if (bracktsFrgmnt.getSectionNumber() == position)
                            break;
                    }
                }
            }
        }
        return bracktsFrgmnt;
    }
}
