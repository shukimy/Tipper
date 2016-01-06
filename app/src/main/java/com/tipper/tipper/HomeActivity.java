package com.tipper.tipper;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button btnAddAcount;
    private FloatingActionButton btnConfig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAddAcount = (Button) findViewById(R.id.addAccount);
        btnAddAcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (connectToAccount()) {
                    showConnectionAlert();
                } else {
                    //TODO
                }
            }
        });

        btnConfig = (FloatingActionButton) findViewById(R.id.openConfig);
        btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConfig();
            }
        });

    }


    private boolean connectToAccount() {
        return true;
    }

    private void showConnectionAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage(R.string.connection_dialog_msg)
                .setTitle(R.string.connection_dialog_title);

        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                startActivity(new Intent(HomeActivity.this, TargetActivity.class));
            }
        });
        AlertDialog dialog = builder.create();

        dialog.show();
    }

    public void openConfig() {
        startActivity(new Intent(this, ConfigActivity.class));
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
