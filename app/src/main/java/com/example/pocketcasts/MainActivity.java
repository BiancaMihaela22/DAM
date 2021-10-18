package com.example.pocketcasts;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Toast.makeText(this,"PocketCasts", Toast.LENGTH_SHORT).show();

        Log.v("lifecycle", "onCreate");

        registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Ati fost inregistrat cu succes!", Toast.LENGTH_SHORT).show();
                Intent registerWindow = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(registerWindow);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.v("lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.v("lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.v("lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.v("lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v("lifecycle", "onDestroy");
    }
}
