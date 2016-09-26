package com.pec.reza.amoozesh.Adapters;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Message;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pec.reza.amoozesh.R;
import com.pec.reza.amoozesh.Utility.TApplication;
import com.pec.reza.amoozesh.model.PayamModel;
import com.pec.reza.amoozesh.ui.DPTextView;
import com.pec.reza.amoozesh.ui.DpButton;

import java.util.ArrayList;

public class AdapterPayamList extends ArrayAdapter<PayamModel> {


    public AdapterPayamList(ArrayList<PayamModel> array) {
        super(TApplication.applicationContext, R.layout.activity_message_items, array);
    }


    private static class ViewHolder {
        public TextView txtSender;
        public TextView txtDate;
        public TextView txtTitle;
        public ViewGroup layoutRoot;

        public ViewHolder(View view) {
            txtSender = (TextView) view.findViewById(R.id.message_items_sender_txt);
            txtDate = (TextView) view.findViewById(R.id.message_items_date_txt);
            txtTitle = (TextView) view.findViewById(R.id.message_item_title_txt);
            layoutRoot = (ViewGroup) view.findViewById(R.id.message_items_ly);
        }


        public void fill(final ArrayAdapter<PayamModel> adapter, final PayamModel item, final int position) {
            txtSender.setText(item.payam_sender);
            txtDate.setText(item.payam_sender);
//            chkDone.setChecked(item.done);
            layoutRoot.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    final Dialog dialog = new Dialog(TApplication.currentActivity, R.style.NewDialog);
                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                    dialog.setContentView(R.layout.dialog_message_detail);
                    dialog.setCancelable(true);
                    dialog.setCanceledOnTouchOutside(true);
                    final DPTextView diagSenserTxt = (DPTextView) dialog.findViewById(R.id.dialog_message_sender_txt);
                    final DPTextView diagDateTxt = (DPTextView) dialog.findViewById(R.id.dialog_message_date_txt);
                    final DPTextView diagTitleTxt = (DPTextView) dialog.findViewById(R.id.dialog_message_title_txt);
                    final DPTextView diagContentTxt = (DPTextView) dialog.findViewById(R.id.dialog_message_content_txt);
                    final DpButton diagCancelbtn = (DpButton) dialog.findViewById(R.id.dialog_message_cancel_btn);

                    diagCancelbtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    dialog.show();

                }
            });


        }
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        PayamModel item = getItem(position);
        if (convertView == null) {
            convertView = TApplication.inflater.inflate(R.layout.activity_message_items, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.fill(this, item, position);
        return convertView;
    }


}
