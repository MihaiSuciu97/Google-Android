package com.example.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MasterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.master_activity);

        String whatToLoad = getIntent().getStringExtra("whatToLoad");

        if(whatToLoad.equals("hello")){
            addHelloFragment();
        }else if(whatToLoad.equals("another")){
                 addOtherFragment();
        }
    }
    private void addHelloFragment() {
        HelloFragment fragment = new HelloFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.detail,fragment,HelloFragment.class.getSimpleName())
                .commit();
    }
    private void addOtherFragment(){
        AnotherFragment fragment = new AnotherFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.detail,fragment,HelloFragment.class.getSimpleName())
                .commit();
    }
}
