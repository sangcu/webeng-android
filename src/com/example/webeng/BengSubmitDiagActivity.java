package com.example.webeng;

import android.os.Bundle;
import android.view.View;

import BaseClasses.BaseActivity;

/**
 * Created by sangcu on 2/23/14.
 */
public class BengSubmitDiagActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beng_submit_dialog);
    }

    public void onDiscard(View view) {
        finish();
    }
}