package com.tipper.tipper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TargetStatusActivity extends AppCompatActivity {

    private Button tipButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_status);

        tipButton = (Button) findViewById(R.id.tipButton);
        tipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TargetStatusActivity.this, TipsActivity.class));
            }
        });

    }

}
