package com.pec.reza.amoozesh.Adapters;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.pec.reza.amoozesh.R;
import com.pec.reza.amoozesh.TutorialTermDetailActivity;
import com.pec.reza.amoozesh.Utility.TApplication;
import com.pec.reza.amoozesh.model.PointModel;
import com.pec.reza.amoozesh.model.TutorialTermModel;
import com.pec.reza.amoozesh.ui.DPTextView;
import com.pec.reza.amoozesh.ui.DpButton;

import java.util.ArrayList;

/**
 * Created by User on 09/26/2016.
 */
public class AdapterPointsList extends ArrayAdapter<PointModel> {
    public AdapterPointsList(ArrayList<PointModel> array) {
        super(TApplication.applicationContext, R.layout.activity_points_items, array);
    }

    private static class ViewHolder {
        public DpButton btnSeason;
        public ViewHolder(View view) {
            btnSeason = (DpButton) view.findViewById(R.id.points_btn);
        }
        public void fill(final ArrayAdapter<PointModel> adapter, final PointModel item, final int position) {
            btnSeason.setText(item.exam_season);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        PointModel item = getItem(position);
        if (convertView == null) {
            convertView = TApplication.inflater.inflate(R.layout.activity_points_items ,parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.fill(this, item, position);
        return convertView;
    }

}
