package com.example.quedos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.signup);
    }

    public void editdetails(View view) {
        Intent dsp = new Intent(MainActivity.this, EditProfile.class);
        startActivity(dsp);
    }

        public void quiz(View view) {
            Intent dsp = new Intent(MainActivity.this,QuizzesHome.class);
            startActivity(dsp);
    }
}