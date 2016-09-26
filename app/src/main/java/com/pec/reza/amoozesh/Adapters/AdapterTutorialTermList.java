package com.pec.reza.amoozesh.Adapters;

import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pec.reza.amoozesh.R;
import com.pec.reza.amoozesh.TutorialTermDetailActivity;
import com.pec.reza.amoozesh.Utility.TApplication;
import com.pec.reza.amoozesh.model.PayamModel;
import com.pec.reza.amoozesh.model.TutorialTermModel;
import com.pec.reza.amoozesh.ui.DPTextView;
import com.pec.reza.amoozesh.ui.DpButton;

import java.util.ArrayList;

/**
 * Created by User on 09/25/2016.
 */
public class AdapterTutorialTermList extends ArrayAdapter<TutorialTermModel> {
    public AdapterTutorialTermList(ArrayList<TutorialTermModel> array) {
        super(TApplication.applicationContext, R.layout.activity_tutorial_term_items, array);
    }

    private static class ViewHolder {
        public DPTextView txtCode;
        public DPTextView txtDate;
        public DPTextView txtName;
        public DPTextView txtStartDate;
        public ViewGroup layoutRoot;

        public ViewHolder(View view) {
            txtCode = (DPTextView) view.findViewById(R.id.tutorial_term_code_txt);
            txtDate = (DPTextView) view.findViewById(R.id.tutorial_term_date_txt);
            txtName = (DPTextView) view.findViewById(R.id.tutorial_term_name_txt);
            txtStartDate = (DPTextView) view.findViewById(R.id.tutorial_term_startdate_txt);
            layoutRoot = (ViewGroup) view.findViewById(R.id.tutorial_term_ly);
        }
        public void fill(final ArrayAdapter<TutorialTermModel> adapter, final TutorialTermModel item, final int position) {
            txtCode.setText(item.term_code);
            txtDate.setText(item.term_name);
//            chkDone.setChecked(item.done);
            layoutRoot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    Intent intent = new Intent(TApplication.currentActivity , TutorialTermDetailActivity.class);
                    TApplication.currentActivity.startActivity(intent);
                }
            });
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        TutorialTermModel item = getItem(position);
        if (convertView == null) {
            convertView = TApplication.inflater.inflate(R.layout.activity_tutorial_term_items, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.fill(this, item, position);
        return convertView;
    }
}
