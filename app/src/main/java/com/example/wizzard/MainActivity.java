package com.example.wizzard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNextClick(View view) {
        if (view instanceof TextView){
            EditText result = findViewById(R.id.nameTextView);

            Intent i = new Intent(this, MainActivity2.class);
            i.putExtra("name",result.getText().toString());
            startActivity(i);
        }
    }
}