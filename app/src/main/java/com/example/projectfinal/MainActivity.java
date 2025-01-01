package com.example.projectfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button Go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ربط زر "Go" مع الكود
        Go = findViewById(R.id.Go);

        // مستمع الضغط على الزر
        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // إنشاء Intent للانتقال إلى صفحة تسجيل الدخول
                Intent intent = new Intent(MainActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });
    }
}
