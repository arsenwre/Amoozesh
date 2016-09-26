package com.pec.reza.amoozesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.pec.reza.amoozesh.ui.DPTextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TutorialTermDetailActivity extends MainMenuActivity {

    @Bind(R.id.toolbar_img_back)
    ImageView imgBack;
    DPTextView toolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_term_details);
        ButterKnife.bind(this);
        toolbarTitle = (DPTextView) findViewById(R.id.toolbar_txt_tittle);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//        SharedPreference sharedPreference = new SharedPreference();
        toolbarTitle.setText("جزئیات دوره");
        toolbarTitle.setTextSize(15);
    }
}
