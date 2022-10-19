package com.example.wizzard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle extras = getIntent().getExtras();

        TextView nameText = findViewById(R.id.nameText);
        TextView ageText = findViewById(R.id.ageText);

        nameText.setText(extras.getString("name"));
        ageText.setText(extras.getString("age"));

    }
}