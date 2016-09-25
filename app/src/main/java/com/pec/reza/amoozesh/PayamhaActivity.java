package com.pec.reza.amoozesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pec.reza.amoozesh.Adapters.AdapterPayamList;
import com.pec.reza.amoozesh.Utility.TApplication;
import com.pec.reza.amoozesh.model.PayamModel;

import java.util.ArrayList;

public class PayamhaActivity extends MainMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        ListView lstContent = (ListView) findViewById(R.id.message_listView);
//        SharedPreference sharedPreference = new SharedPreference();

       ArrayList<PayamModel> PayamModel = new ArrayList<>();
        adapter = new AdapterPayamList(PayamModel);
        lstContent.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    public ArrayAdapter adapter;
    @Override
    protected void onResume() {
        TApplication.currentActivity = this;
        super.onResume();

        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
