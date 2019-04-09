package com.example.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity_layout);
        Log.d("LIFECYCLE_TAG","onCreate");
        textView = findViewById(R.id.textview);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LIFECYCLE_TAG","onStart");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LIFECYCLE_TAG","onRestart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LIFECYCLE_TAG","onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("LIFECYCLE_TAG","onPause");
        textView.setText("1234");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LIFECYCLE_TAG","onStop");

}

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LIFECYCLE_TAG","onDestroy");
    }




}
