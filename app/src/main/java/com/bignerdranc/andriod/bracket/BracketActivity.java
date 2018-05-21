package com.bignerdranc.andriod.bracket;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import java.util.UUID;

public class BracketActivity extends AppCompatActivity {


    public BracketsFragment bracketFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_brackets);
        initialiseBracketsFragment();
    }

    private void initialiseBracketsFragment() {

        bracketFragment = new BracketsFragment();
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, bracketFragment,"brackets_home_fragment");
        transaction.commit();
        manager.executePendingTransactions();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setScreenSize();

    }

    private void setScreenSize() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        BracketsApplication.getInstance().setScreenHeight(height);
    }

    public static final String EXTRA_Bracket_ID = "com.example.ayala.irosster.player_id";

    public static Intent newIntent(Context packageContext, UUID playerId){
        Intent intent = new Intent (packageContext, BracketActivity.class);
        intent.putExtra(EXTRA_Bracket_ID, playerId);
        return intent;
    }
}
