package com.tipper.tipper;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class TipsActivity extends AppCompatActivity {

    ImageButton iconTip1;
    ImageButton iconTip2;
    ImageButton iconTip3;
    ImageButton iconTip4;
    ImageButton iconTip5;
    ImageButton iconTip6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        iconTip1 = (ImageButton) findViewById(R.id.iconTip1);
        iconTip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTipPop(R.string.tip1_dialog_title, R.string.tip1_dialog_msg);
            }
        });

        iconTip2 = (ImageButton) findViewById(R.id.iconTip2);
        iconTip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTipPop(R.string.tip2_dialog_title, R.string.tip2_dialog_msg);
            }
        });

        iconTip3 = (ImageButton) findViewById(R.id.iconTip3);
        iconTip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTipPop(R.string.tip3_dialog_title, R.string.tip3_dialog_msg);
            }
        });

        iconTip4 = (ImageButton) findViewById(R.id.iconTip4);
        iconTip4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTipPop(R.string.tip4_dialog_title, R.string.tip4_dialog_msg);
            }
        });

        iconTip5 = (ImageButton) findViewById(R.id.iconTip5);
        iconTip5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTipPop(R.string.tip5_dialog_title, R.string.tip5_dialog_msg);
            }
        });

        iconTip6 = (ImageButton) findViewById(R.id.iconTip6);
        iconTip6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTipPop(R.string.tip6_dialog_title, R.string.tip6_dialog_msg);
            }
        });


    }

    private void openTipPop(int titleRes, int msgRes) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage(msgRes)
                .setTitle(titleRes);

        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

    }


}
