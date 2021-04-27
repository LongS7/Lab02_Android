package com.longs7.android_lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        findViewById(R.id.btnDatHang).setOnClickListener(v -> {
            Toast.makeText(this, "Bạn đã đặt hàng", Toast.LENGTH_SHORT).show();
        });
    }
}
