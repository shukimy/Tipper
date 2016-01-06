package com.tipper.tipper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class BalanceAccountActivity extends AppCompatActivity {
    private FloatingActionButton btnConfig;
    private int amount;
    private int time;
    private int needToSavePerMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_account);

        btnConfig = (FloatingActionButton) findViewById(R.id.openConfig);
        btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConfig();
            }
        });
        btnConfig.setVisibility(View.GONE);
        time = getIntent().getExtras().getInt("time");
        amount = getIntent().getExtras().getInt("amount");
        needToSavePerMonth = amount / time - 1245;
        //TODO : in case needToSavePerMonth is less than 0
        if (needToSavePerMonth < 0) {
            //TODO: YOU ARE IN MINUS HABUB
        }

        TextView tv1 = (TextView) findViewById(R.id.amount);
        tv1.setText("על מנת לחסוך " + amount + " שקלים ");

        TextView tv2 = (TextView) findViewById(R.id.time);
        tv2.setText("ב" + time + " חודשים");

        TextView tv3 = (TextView) findViewById(R.id.needToSave);
        tv3.setText("עלייך לחסוך " + needToSavePerMonth + " ש״ח נוספים בחודש. ");
    }


    public void openConfig() {
        startActivity(new Intent(this, ConfigActivity.class));
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
