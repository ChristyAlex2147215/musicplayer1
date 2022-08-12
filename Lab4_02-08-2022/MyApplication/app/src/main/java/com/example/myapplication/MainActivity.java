package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected  void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Resuming App",Toast.LENGTH_SHORT).show();
//        t1.setText("Resuming App");
//        t1.show();
    }
    @Override
    protected  void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Starting App",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected  void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Pausing App",Toast.LENGTH_SHORT).show();
//        t1.setText("Pausing App");
//        t1.show();
    }
    @Override
    protected  void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Stopping App",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void  onRestart()
    {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"Restarting App",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Destroyed App",Toast.LENGTH_SHORT).show();

    }

}