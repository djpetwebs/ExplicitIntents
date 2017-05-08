package com.beebaby3.explicitintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoActivity(View v) {

        switch(v.getId()) {

            case R.id.bMethod1:
                Intent i = new Intent(ActivityA.this, ActivityB.class);
                startActivity(i);
                break;

            case R.id.bMethod2:
                Intent j = new Intent("android.intent.action.ActivityB");
                startActivity(j);
                break;

            case R.id.bMethod3:
                Intent k = new Intent(ActivityA.this, ActivityB.class);
                k.setClassName("com.beebaby3.explicitintents", "com.beebaby3.explicitintents.ActivityB");
                startActivity(k);
                break;


        }

    }
}
