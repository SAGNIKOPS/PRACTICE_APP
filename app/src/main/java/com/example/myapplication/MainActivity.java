package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"onCreate()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"OnStart()",Toast.LENGTH_SHORT).show();
    }protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"OnResume()",Toast.LENGTH_SHORT).show();
    }protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"OnPause()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this,"onRestart()",Toast.LENGTH_SHORT).show();
    }protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"onStop()",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"onDestroy()",Toast.LENGTH_SHORT).show();
    }
}