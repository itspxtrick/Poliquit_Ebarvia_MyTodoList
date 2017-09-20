package com.patrick.mytodolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
    }
    public void taskCreate (View view) {
        Intent intent = new Intent(this, ActivitySix.class);
        startActivity(intent);
    }
}
