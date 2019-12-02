package com.example.finalproject3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class NewGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startBtn = findViewById(R.id.startBtn);

        startBtn.setOnClickListener(unused -> startBtnClicked());
    }
    private void startBtnClicked() {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
        finish();
    }

}
