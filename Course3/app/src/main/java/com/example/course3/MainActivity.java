package com.example.course3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
   /* pentru webview
      private static final String URL_TO_LOAD="https://www.google.com";*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        final SpinnerDataSource dataSource = new SpinnerDataSource();

        ArrayAdapter<String> adapter = getAdapter(dataSource);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String spinnerItem = dataSource.getDataSource().get(position);
                Log.d("Spinner item",spinnerItem);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    private ArrayAdapter<String> getAdapter(SpinnerDataSource dataSource){
        return new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                dataSource.getDataSource()
        );
    }

}

/*     pentru webView
        WebView webView = findViewById(R.id.webview);
        WebSettings settings =webView.getSettings();

        webView.loadUrl(URL_TO_LOAD);*/


