package com.pec.reza.amoozesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.pec.reza.amoozesh.Adapters.LatestCoursesAdapter;
import com.pec.reza.amoozesh.model.LatestCourseModel;

import java.util.ArrayList;
import java.util.List;

public class LatestTrainingCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latest_training_courses);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_latest_training_courses, menu);
        ListView lv = (ListView)findViewById(R.id.listView2);
        ArrayList<LatestCourseModel> list = new ArrayList<LatestCourseModel>();
        LatestCourseModel model = new LatestCourseModel();
        model.Name = "دوره آموزش یک";
        model.Code = 12784;
        list.add(model);
        model = new LatestCourseModel();
        model.Name = "دوره آموزشی دو";
        model.Code = 88632;
        list.add(model);
        LatestCoursesAdapter adapter = new LatestCoursesAdapter(this,list);
        lv.setAdapter(adapter);
        ProgressBar pb = (ProgressBar)findViewById(R.id.progressBar);
        pb.setVisibility(View.GONE);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
