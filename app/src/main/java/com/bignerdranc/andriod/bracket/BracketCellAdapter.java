package com.bignerdranc.andriod.bracket;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mcsuser on 5/20/18.
 */

public class BracketsCellAdapter extends RecyclerView.Adapter<ViewHolder>{

    private BracketsColomnFragment fragment;
    private Context context;
    private ArrayList<MatchData> list;
    private boolean handler;

    public BracketsCellAdapter(BracketsColomnFragment bracketsColomnFragment, Context context, ArrayList<MatchData> list) {

        this.fragment = bracketsColomnFragment;
        this.context = context;
        this.list = list;
    }

    public BracketsCellAdapter(List<Team> teams) {
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cell_layout, parent, false);
        return new BracketsCellViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        BracketsCellViewHolder viewHolder = null;
        if (holder instanceof BracketsCellViewHolder){
            viewHolder = (BracketsCellViewHolder) holder;
            setFields(viewHolder, position);

        }
    }

    private void setFields(final BracketsCellViewHolder viewHolder, final int position) {

        viewHolder.getTeamOneName().setText(list.get(position).getCompetitorOne().getName());
        viewHolder.getTeamTwoName().setText(list.get(position).getCompetitorTwo().getName());
        viewHolder.getTeamOneScore().setText(list.get(position).getCompetitorOne().getScore());
        viewHolder.getTeamTwoScore().setText(list.get(position).getCompetitorTwo().getScore());
    }




    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public void setList(ArrayList<MatchData> colomnList) {
        this.list = colomnList;
        notifyDataSetChanged();
    }
}

