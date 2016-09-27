package com.pec.reza.amoozesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.pec.reza.amoozesh.Adapters.AdapterTutorialTermHistoryList;
import com.pec.reza.amoozesh.Adapters.AdapterTutorialTermList;
import com.pec.reza.amoozesh.Utility.TApplication;
import com.pec.reza.amoozesh.model.TutorialTermHistoryModel;
import com.pec.reza.amoozesh.model.TutorialTermModel;
import com.pec.reza.amoozesh.ui.DPTextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TutorialHistoryActivity extends MainMenuActivity {

    @Bind(R.id.toolbar_img_back)
    ImageView imgBack;
    DPTextView toolbarTitle;
    public ArrayAdapter adapter;
    TutorialTermHistoryModel tutorialTermHistoryModel = new TutorialTermHistoryModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_history);
        ButterKnife.bind(this);
        TApplication.currentActivity = this;
        toolbarTitle = (DPTextView) findViewById(R.id.toolbar_txt_tittle);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ListView lstContent = (ListView) findViewById(R.id.tutorial_history_listview);
//        SharedPreference sharedPreference = new SharedPreference();
        toolbarTitle.setText("سوابق آموزشی");
        toolbarTitle.setTextSize(15);
        ArrayList<TutorialTermHistoryModel> TutorialHistoryTerms = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            tutorialTermHistoryModel.term_code = "HiChI";
            tutorialTermHistoryModel.term_name = "MAN";
            tutorialTermHistoryModel.term_session = "95/8/76";
            tutorialTermHistoryModel.term_start = "BaRaKHoshi";
            TutorialHistoryTerms.add(tutorialTermHistoryModel);
        }
        adapter = new AdapterTutorialTermHistoryList(TutorialHistoryTerms);
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
