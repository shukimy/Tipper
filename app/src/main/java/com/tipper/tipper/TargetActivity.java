package com.tipper.tipper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class TargetActivity extends AppCompatActivity {
    private Button saveButton;
    private Spinner spinTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_conf);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<String> routes = new ArrayList<String>();
        routes.add("ספרינט");
        routes.add("מרתון");

        ArrayAdapter<String> routesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, routes);

        Spinner spinRoute = (Spinner) findViewById(R.id.routeSpinner);
        spinRoute.setAdapter(routesAdapter);

        ArrayList<String> targets = new ArrayList<String>();
        targets.add("נסיעה לחול");
        targets.add("קניית דירה");
        targets.add("קניית אוטו");
        targets.add("אחר");

        ArrayAdapter<String> targetAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, targets);

        final Spinner spinTarget = (Spinner) findViewById(R.id.targetSpinner);
        spinTarget.setAdapter(targetAdapter);

        final EditText amountTxt = (EditText) findViewById(R.id.amountTxt);


        ArrayList<String> times = new ArrayList<String>();
        times.add("חודש");
        times.add("חודשיים");
        times.add("שלושה חודשיים");
        times.add("חצי שנה");
        times.add("שנה");
        //TODO support other times.add("אחר");

        ArrayAdapter<String> timesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, times);

        spinTime = (Spinner) findViewById(R.id.timeSpinner);
        spinTime.setAdapter(timesAdapter);

        saveButton = (Button) findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validate amount is not empty
                if (TextUtils.isEmpty(amountTxt.getText().toString())) {
                    amountTxt.setError("נדרש למלא סכום");
                } else {
                    //pass target and target timeline
                    Intent intent = new Intent(TargetActivity.this, BalanceAccountActivity.class);
                    intent.putExtra("amount", (int) Math.floor(Double.parseDouble(amountTxt.getText().toString())));
                    intent.putExtra("time", getTimeFromSpinner());
                    intent.putExtra("target", spinTarget.getSelectedItem().toString());
                    startActivity(intent);
                }


            }
        });
    }

    private int getTimeFromSpinner() {
        int time = spinTime.getSelectedItemPosition();
        switch (time) {
            case 0:
                time = 1;
                break;
            case 1:
                time = 2;
                break;
            case 2:
                time = 3;
                break;
            case 3:
                time = 6;
                break;
            case 4:
                time = 12;
                break;
        }
        return time;
    }

}
