package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Displaying Toast with Hello Javatpoint message
        Toast.makeText(getApplicationContext(),"Hello Javatpoint, PROOF",Toast.LENGTH_SHORT).show();

        button=(Button)findViewById(R.id.button2);
    }


    public void onClick(View v) {
        Intent intent = new Intent(SecondActivity.this,MainActivity.class);
        startActivity(intent);
    }
}