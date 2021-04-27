package com.longs7.android_lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class RatingActivity extends AppCompatActivity {

    private TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        tvContent = findViewById(R.id.tvContent);

        findViewById(R.id.btnSend).setOnClickListener(v -> {
            Toast.makeText(this, tvContent.getText(), Toast.LENGTH_SHORT).show();
        });
    }
}
