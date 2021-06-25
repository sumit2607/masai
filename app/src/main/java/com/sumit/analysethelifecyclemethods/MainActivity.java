package com.sumit.analysethelifecyclemethods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private final String  tag = "MainActivity";
private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("tag", "OnCreate");
        button = findViewById(R.id.button) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Clicked On Button one", Toast.LENGTH_SHORT).show();
                Log.d("tag", "You Clicked On Button one");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                Log.d("MainActivity","you are on First Activity Page and You clicked on 1st activity button");

            }
        });


        }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag", "onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag", "onPause");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("tag","onDestroy");
    }
}
