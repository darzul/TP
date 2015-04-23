package com.example.evaneos.tp.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.evaneos.tp.R;
import com.example.evaneos.tp.fragment.MyFragment;

public class MyActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new MyFragment())
                .commit();
    }
}
