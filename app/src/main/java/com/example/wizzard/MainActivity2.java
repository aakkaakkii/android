package com.example.wizzard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onNextClick(View view) {
        if (view instanceof TextView){
            EditText result = findViewById(R.id.ageTextView);

            Bundle extras = getIntent().getExtras();


            Intent i = new Intent(this, MainActivity3.class);
            i.putExtra("name",extras.getString("name"));
            i.putExtra("age", result.getText().toString());
            startActivity(i);
        }
    }
}