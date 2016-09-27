package com.pec.reza.amoozesh.Adapters;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.pec.reza.amoozesh.R;
import com.pec.reza.amoozesh.TutorialTermDetailActivity;
import com.pec.reza.amoozesh.Utility.TApplication;
import com.pec.reza.amoozesh.model.TutorialTermHistoryModel;
import com.pec.reza.amoozesh.model.TutorialTermModel;
import com.pec.reza.amoozesh.ui.DPTextView;

import java.util.ArrayList;

/**
 * Created by User on 09/27/2016.
 */
public class AdapterTutorialTermHistoryList extends ArrayAdapter<TutorialTermHistoryModel> {
    public AdapterTutorialTermHistoryList(ArrayList<TutorialTermHistoryModel> array) {
        super(TApplication.applicationContext, R.layout.activity_tutorial_history_items, array);
    }

    private static class ViewHolder {
        public DPTextView txtCode;
        public DPTextView txtStatus;
        public DPTextView termName;
        public DPTextView txtDate;
        public DPTextView txtTeacherName;
        public ViewGroup layoutRoot;

        public ViewHolder(View view) {
            termName = (DPTextView) view.findViewById(R.id.tutorial_history_termName_txt);
            txtStatus = (DPTextView) view.findViewById(R.id.tutorial_history_status_txt);
            txtTeacherName = (DPTextView) view.findViewById(R.id.tutorial_history_teacherName_txt);
            txtDate = (DPTextView) view.findViewById(R.id.tutorial_history_date_txt);
            txtCode = (DPTextView) view.findViewById(R.id.tutorial_history_termCode_txt);
        }
        public void fill(final ArrayAdapter<TutorialTermHistoryModel> adapter, final TutorialTermHistoryModel item, final int position) {
            txtCode.setText(item.term_code);
            txtDate.setText(item.term_name);
//            chkDone.setChecked(item.done);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        TutorialTermHistoryModel item = getItem(position);
        if (convertView == null) {
            convertView = TApplication.inflater.inflate(R.layout.activity_tutorial_history_items, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.fill(this, item, position);
        return convertView;
    }
}
