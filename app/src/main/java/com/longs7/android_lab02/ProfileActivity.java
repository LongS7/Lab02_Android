package com.longs7.android_lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        findViewById(R.id.btnHire).setOnClickListener(v -> {
            Toast.makeText(this, "You hired me!", Toast.LENGTH_SHORT).show();
        });
    }
}
