package com.pec.reza.amoozesh.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pec.reza.amoozesh.R;
import com.pec.reza.amoozesh.model.LatestCourseModel;

import java.util.List;

/**
 * Created by Reza on 12/09/2016.
 */
public class LatestCoursesAdapter extends ArrayAdapter<LatestCourseModel> {

    List<LatestCourseModel> _items;
    public LatestCoursesAdapter(Context context, List<LatestCourseModel> items ) {
            super(context, R.layout.trainingcourse_item,items);
        _items = items;
    }

    @Override
    public int getCount() {
        return _items.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater li = LayoutInflater.from(getContext());
            v = li.inflate(R.layout.trainingcourse_item, null);
        }

        LatestCourseModel item = _items.get(position);

        TextView txtName = (TextView)v.findViewById(R.id.txtNamePH);
        TextView txtCode = (TextView)v.findViewById(R.id.txtCodePH);

        txtName.setText(item.Name);
        txtCode.setText(Integer.toString(item.Code));

        return v;
    }
}
