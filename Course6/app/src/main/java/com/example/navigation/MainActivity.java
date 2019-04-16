package com.example.navigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = new Bundle();
        bundle.putString("label","This is an activity label");

       /* HelloFragment fragment = new HelloFragment();
        fragment.setArguments(bundle);
*/

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame,new HelloFragment(),HelloFragment.class.getSimpleName())
                .commit();
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.frame,new AnotherFragment(),AnotherFragment.class.getSimpleName())
//                //.addToBackStack(AnotherFragment.class.getSimpleName())
//                .commit();
    }

    @Override
    protected void onStart() {
        super.onStart();

        HelloFragment fragment = (HelloFragment) getSupportFragmentManager().findFragmentByTag(HelloFragment.class.getSimpleName());
        fragment.setLabel("This is a method set label");
    }
}
