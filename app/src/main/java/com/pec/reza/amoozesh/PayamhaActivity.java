package com.pec.reza.amoozesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.pec.reza.amoozesh.Adapters.AdapterPayamList;
import com.pec.reza.amoozesh.Utility.TApplication;
import com.pec.reza.amoozesh.model.PayamModel;
import com.pec.reza.amoozesh.ui.DPTextView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PayamhaActivity extends MainMenuActivity {

    @Bind(R.id.toolbar_img_back)
    ImageView imgBack;
    DPTextView toolbarTitle;
    public ArrayAdapter adapter;
    PayamModel payamModel = new PayamModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        ButterKnife.bind(this);
        toolbarTitle = (DPTextView) findViewById(R.id.toolbar_txt_tittle);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        ListView lstContent = (ListView) findViewById(R.id.message_listView);
//        SharedPreference sharedPreference = new SharedPreference();
        toolbarTitle.setText("پیام ها");
        ArrayList<PayamModel> PayamModels = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            payamModel.payam_content = "HiChI";
            payamModel.payam_sender = "MAN";
            payamModel.payam_date = "95/8/76";
            payamModel.payam_title = "BaRaKHoshi";
            PayamModels.add(payamModel);
        }
        adapter = new AdapterPayamList(PayamModels);
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
