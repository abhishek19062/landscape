package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("start","in creation");
    }
    protected void onStart()
    {
          super.onStart();
          Log.d("start","in start");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d("start","in restart");
    }
    protected void onResume()
    {
        super.onResume();
        Log.d("start","in resume");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("start","in stop");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("start","in destroy");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("start","in pause");
    }
}
