package com.example.navigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Listener {

    private boolean isLandScape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.isLandScape=findViewById(R.id.detail) != null;

        MasterFragment masterFragment = new MasterFragment();
        masterFragment.setListener(this);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.master,masterFragment,MasterFragment.class.getSimpleName())
                .commit();

       /* Bundle bundle = new Bundle();
        bundle.putString("label","This is an activity label");*/

      /* HelloFragment fragment = new HelloFragment();
       fragment.setListener(this);


        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame,fragment,HelloFragment.class.getSimpleName())
                .commit();*/
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.frame,new AnotherFragment(),AnotherFragment.class.getSimpleName())
//                //.addToBackStack(AnotherFragment.class.getSimpleName())
//                .commit();
    }
    @Override
    public void showHelloFragment() {
        if(isLandScape) {
            addHelloFragment();
        }
        else{
            Intent intent = new Intent(this,MasterActivity.class);
            intent.putExtra("whatToLoad","hello");
            startActivity(intent);
        }
    }

    @Override
    public void showAnotherFragment() {
        if(isLandScape) {
            addOtherFragment();
        }
        else{
            Intent intent = new Intent(this,MasterActivity.class);
            intent.putExtra("whatToLoad","another");
            startActivity(intent);
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

   /* @Override
    protected void onStart() {
        super.onStart();

        HelloFragment fragment = (HelloFragment) getSupportFragmentManager().findFragmentByTag(HelloFragment.class.getSimpleName());
        fragment.setLabel("This is a method set label");
    }*/

   /* @Override
    public void theseAreNumbers(int no1, int no2) {
        Toast.makeText(this,"There are numbers,no1: "+no1+" no2: "+no2,Toast.LENGTH_LONG).show();
    }
    public void setNumber(int no1,int no2){
        theseAreNumbers(no1,no2);
    }*/
    private boolean userPressedBackForFirstTime = false;
    @Override
    public void onBackPressed() {
        if(!userPressedBackForFirstTime){
            Toast.makeText(this,"To exit press back again",Toast.LENGTH_LONG).show();
            userPressedBackForFirstTime=true;
        }
        else{
            super.onBackPressed();
        }
    }


}
