package com.example.android;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private CircleImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (CircleImageView)findViewById(R.id.circle_view);
    }

    public void startRotation(View view){
        mImageView.startRotation();
    }

    public void stopRotation(View view){
        mImageView.stopRotation();
    }

}
