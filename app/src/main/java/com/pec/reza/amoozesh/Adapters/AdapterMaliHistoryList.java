package com.pec.reza.amoozesh.Adapters;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.pec.reza.amoozesh.R;
import com.pec.reza.amoozesh.Utility.TApplication;
import com.pec.reza.amoozesh.model.MaliHistoryModel;
import com.pec.reza.amoozesh.model.PayamModel;
import com.pec.reza.amoozesh.ui.DPTextView;
import com.pec.reza.amoozesh.ui.DpButton;

import java.util.ArrayList;

/**
 * Created by User on 09/27/2016.
 */
public class AdapterMaliHistoryList extends ArrayAdapter<MaliHistoryModel> {
    public AdapterMaliHistoryList(ArrayList<MaliHistoryModel> array) {
        super(TApplication.applicationContext, R.layout.activity_mali_history_items, array);
    }


    private static class ViewHolder {
        public DPTextView txtBedehi;
        public DPTextView txtTotalAmount;
        public DPTextView txtShahrie;


        public ViewHolder(View view) {
            txtBedehi = (DPTextView) view.findViewById(R.id.mali_history_bedehi_txt);
            txtTotalAmount = (DPTextView) view.findViewById(R.id.mali_history_totalAmount_txt);
            txtShahrie = (DPTextView) view.findViewById(R.id.mali_history_totalShahrie_txt);
        }


        public void fill(final ArrayAdapter<MaliHistoryModel> adapter, final MaliHistoryModel item, final int position) {
            txtBedehi.setText(item.loan_amount);
            txtTotalAmount.setText(item.total_amount);
//            chkDone.setChecked(item.done);
        }
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        MaliHistoryModel item = getItem(position);
        if (convertView == null) {
            convertView = TApplication.inflater.inflate(R.layout.activity_mali_history_items, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.fill(this, item, position);
        return convertView;
    }
}
