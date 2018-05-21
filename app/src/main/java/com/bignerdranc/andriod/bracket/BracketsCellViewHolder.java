package com.bignerdranc.andriod.bracket;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by mcsuser on 5/20/18.
 */

class BracketsCellViewHolder extends RecyclerView.ViewHolder {

    private TextView teamOneName;
    private TextView teamTwoName;
    private TextView teamOneScore;
    private TextView teamTwoScore;
    private RelativeLayout rootLayout;

    public BracketsCellViewHolder(View itemView) {
        super(itemView);
        teamOneName = (TextView) itemView.findViewById(R.id.team_one_name);
        teamTwoName = (TextView) itemView.findViewById(R.id.team_two_name);
        teamOneScore = (TextView) itemView.findViewById(R.id.team_one_score);
        teamTwoScore = (TextView) itemView.findViewById(R.id.team_two_score);
        rootLayout = (RelativeLayout) itemView.findViewById(R.id.layout_root);
    }



    public TextView getTeamTwoName() {
        return teamTwoName;
    }

    public TextView getTeamOneScore() {
        return teamOneScore;
    }

    public TextView getTeamTwoScore() {
        return teamTwoScore;
    }

    public TextView getTeamOneName() {
        return teamOneName;
    }
}



