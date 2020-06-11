package com.example.jokedisplaylib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {
    String mJoke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        mJoke = getIntent().getStringExtra("joke");
        TextView jokeView = findViewById(R.id.joke_display);
        jokeView.setText(mJoke);
    }
}