package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String text;
    private boolean isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          /*((CheckBox) findViewById(R.id.notify_me)).setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                       MainActivity.this.isChecked=isChecked;
                    }
                });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, (isChecked ? "Checked" : "Unchecked"), Toast.LENGTH_LONG).show();
            }
        });

       ((EditText) findViewById(R.id.text_edit)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            text=s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) { }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Text is " + text, Toast.LENGTH_LONG).show();
            }

        });*/
        //Log.d( "My tag","Application just started");
    }
}
