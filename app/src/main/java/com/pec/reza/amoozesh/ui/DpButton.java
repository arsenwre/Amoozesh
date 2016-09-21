package com.pec.reza.amoozesh.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Created by DP123 on 1/12/15.
 */
public class DpButton extends TextView {
    public DpButton(Context context) {
        super(context);
        init();
    }

    public DpButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DpButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }


    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "IRAN Sans_0.ttf");
        setTypeface(tf, Typeface.NORMAL);
        setGravity(Gravity.CENTER);


    }
}
