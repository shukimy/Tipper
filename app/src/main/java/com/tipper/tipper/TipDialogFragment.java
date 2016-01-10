package com.tipper.tipper;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;

/**
 * Created by sh on 09/01/2016.
 */
public class TipDialogFragment extends DialogFragment {

    private String title;
    private String msg;


    public void getArguments(String title, String msg) {
        this.title = title;
        this.msg = msg;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.tip_dialog, null));
        builder.setMessage(msg)
                .setTitle(title);
        return builder.create();
    }


}
