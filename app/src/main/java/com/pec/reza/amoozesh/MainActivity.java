package com.pec.reza.amoozesh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import butterknife.Bind;
import butterknife.ButterKnife;


import com.pec.reza.amoozesh.ui.DpButton;
import com.pec.reza.amoozesh.ui.rippleView.RippleView;

public class MainActivity extends MainMenuActivity {

    @Bind(R.id.btn_shahrie_rip)
    RippleView btnShahrie;
    @Bind(R.id.btn_payamha_rip)
    RippleView btnPayamha;
    @Bind(R.id.btn_doreha_rip)
    RippleView btnDoreha;
    @Bind(R.id.btn_savabegh_rip)
    RippleView btnSavabegh;
    @Bind(R.id.btn_nazarsanji_rip)
    RippleView btnNazarsanji;
    @Bind(R.id.btn_nomerat_rip)
    RippleView btnNomerat;
    @Bind(R.id.btn_mali_rip)
    RippleView btnMali;
    @Bind(R.id.btn_charge_rip)
    RippleView btnCharge;
    @Bind(R.id.btn_modiriyat_rip)
    RippleView btnModiriyat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        btnShahrie.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {

            }
        });

        btnPayamha.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent intent = new Intent(MainActivity.this, PayamhaActivity.class);
                startActivity(intent);
            }
        });

        btnDoreha.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent intent = new Intent(MainActivity.this, TutorialTermActivity.class);
                startActivity(intent);
            }
        });

        btnSavabegh.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent intent = new Intent(MainActivity.this, TutorialHistoryActivity.class);
                startActivity(intent);
            }
        });

        btnNazarsanji.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {

            }
        });

        btnNomerat.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent intent = new Intent(MainActivity.this, PointsActivity.class);
                startActivity(intent);
            }
        });

        btnMali.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {
                Intent intent = new Intent(MainActivity.this, MaliHistoryActivty.class);
                startActivity(intent);
            }
        });

        btnCharge.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {

            }
        });

        btnModiriyat.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {
            @Override
            public void onComplete(RippleView rippleView) {

            }
        });
    }

}
