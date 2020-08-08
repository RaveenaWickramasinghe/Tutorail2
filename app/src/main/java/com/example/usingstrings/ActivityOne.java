package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {


    TextView txtView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);

        Log.i(tag: "Lifecycle", msg: "OnCreate() invoked");

    }

    @Override
    public void onStart(){
        super.onStart();
        Log.i(tag:  "Lifecycle",  msg:  "OnStart() invoked");

    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.i(tag:  "Lifecycle", msg:  "OnRestart() invoked");

    }
    @Override
    public void onResume(){
        super.onResume();
        Log.i(tag "Lifecycle", msg  "OnResume() invoked");

    }

}