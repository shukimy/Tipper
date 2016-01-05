package com.tipper.tipper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class TargetActivity extends AppCompatActivity {

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

        Spinner spinTarget = (Spinner) findViewById(R.id.targetSpinner);
        spinTarget.setAdapter(targetAdapter);
    }

}
