package com.pec.reza.amoozesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.pec.reza.amoozesh.Adapters.AdapterPayamList;
import com.pec.reza.amoozesh.Adapters.AdapterTutorialTermList;
import com.pec.reza.amoozesh.Utility.TApplication;
import com.pec.reza.amoozesh.model.PayamModel;
import com.pec.reza.amoozesh.model.TutorialTermModel;
import com.pec.reza.amoozesh.ui.DPTextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TutorialTermActivity extends MainMenuActivity {

    @Bind(R.id.toolbar_img_back)
    ImageView imgBack;
    DPTextView toolbarTitle;
    public ArrayAdapter adapter;
    TutorialTermModel tutorialTermModel = new TutorialTermModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_term);
        ButterKnife.bind(this);
        TApplication.currentActivity = this;
        toolbarTitle = (DPTextView) findViewById(R.id.toolbar_txt_tittle);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ListView lstContent = (ListView) findViewById(R.id.tutorial_term_list);
//        SharedPreference sharedPreference = new SharedPreference();
        toolbarTitle.setText("آخرین دوره های تعریف شده آموزشگاه");
        toolbarTitle.setTextSize(15);
        ArrayList<TutorialTermModel> TutorialTerms = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            tutorialTermModel.term_code = "HiChI";
            tutorialTermModel.term_name = "MAN";
            tutorialTermModel.term_session = "95/8/76";
            tutorialTermModel.term_start = "BaRaKHoshi";
            TutorialTerms.add(tutorialTermModel);
        }
        adapter = new AdapterTutorialTermList(TutorialTerms);
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
