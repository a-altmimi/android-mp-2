package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText quiz = findViewById(R.id.quizeditetext);
        EditText fnl = findViewById(R.id.finaledittext);
        EditText mid = findViewById(R.id.midedittext);
        EditText hw = findViewById(R.id.hwedittext);
        Button button = findViewById(R.id.button);
        TextView result = findViewById(R.id.result);

    }
}