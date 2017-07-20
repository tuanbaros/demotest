package com.simple.demotest;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by FRAMGIA\nguyen.thanh.tuan on 7/19/17.
 */

public class MainAction {

    private String mString;

    private Action1 mAction1;

    private Context mContext;

    public MainAction(Context context, String test, Action1 action1) {
        mString = test;
        mAction1 = action1;
        mContext = context;
    }

    public int abc(String s) {
        if (s == null) {
            mAction1.show(mContext, 0);
            return 0;
        }
        mAction1.show(mContext, s.length());
        return s.length();
    }

}
