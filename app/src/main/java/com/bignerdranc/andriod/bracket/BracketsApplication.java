package com.bignerdranc.andriod.bracket;

import android.app.Application;

/**
 * Created by mcsuser on 5/20/18.
 */

class BracketsApplication extends Application {
    private int screenHeight;
    private static BracketsApplication applicationInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationInstance = this;

    }

    public static synchronized BracketsApplication getInstance() {
        return applicationInstance;
    }



    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }
}
