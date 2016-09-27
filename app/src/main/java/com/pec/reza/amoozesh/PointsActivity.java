package com.pec.reza.amoozesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.pec.reza.amoozesh.Adapters.AdapterPointsList;
import com.pec.reza.amoozesh.Adapters.AdapterTutorialTermList;
import com.pec.reza.amoozesh.Utility.TApplication;
import com.pec.reza.amoozesh.model.PointModel;
import com.pec.reza.amoozesh.model.TutorialTermModel;
import com.pec.reza.amoozesh.ui.DPTextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PointsActivity extends MainMenuActivity {

    @Bind(R.id.toolbar_img_back)
    ImageView imgBack;
    DPTextView toolbarTitle;
    public ArrayAdapter adapter;
    PointModel pointModel = new PointModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
        ButterKnife.bind(this);
        TApplication.currentActivity = this;
        toolbarTitle = (DPTextView) findViewById(R.id.toolbar_txt_tittle);
        toolbarTitle.setText("نمرات آزمون");
        toolbarTitle.setTextSize(15);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ListView lstContent = (ListView) findViewById(R.id.points_listView);
//        SharedPreference sharedPreference = new SharedPreference();
        ArrayList<PointModel> pointModels = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            pointModel.exam_season = "ترم تابستان 95";
            pointModel.term_name = "MAN";
            pointModel.term_session = "95/8/76";
            pointModel.term_start = "BaRaKHoshi";
            pointModels.add(pointModel);
        }
        adapter = new AdapterPointsList(pointModels);
        lstContent.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    @Override
    protected void onResume() {
        TApplication.currentActivity = this;
        super.onResume();

        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
