package com.patrick.mytodolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }

    public void taskCreate (View view) {
        Intent intent = new Intent(this, ActivityThree.class);
        startActivity(intent);
    }
}
