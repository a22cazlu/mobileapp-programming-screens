package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText myNewEdt;
    Button firstBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstBtn = findViewById(R.id.firstBtn);

        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myNewEdt = (EditText) findViewById(R.id.myNewEdt);
                String N = myNewEdt.getText().toString();
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("name" , N);
                startActivity(i);
            }
        });
    }
}
