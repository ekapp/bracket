package com.bignerdranc.andriod.bracket;

import android.util.DisplayMetrics;

/**
 * Created by mcsuser on 5/20/18.
 */

class BracketsUtility {
    public static int dpToPx(int dp) {
        DisplayMetrics displayMetrics = BracketsApplication.getInstance().getBaseContext().getResources().getDisplayMetrics();
        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}
