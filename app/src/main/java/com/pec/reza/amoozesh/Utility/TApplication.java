package com.pec.reza.amoozesh.Utility;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;


import java.util.ArrayList;

/**
 * Created by a.ebrahiminia on 7/11/2016.
 */
public class TApplication extends Application {

    public static volatile Context applicationContext;
    public static Activity currentActivity;
    public static LayoutInflater inflater;
    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
}
