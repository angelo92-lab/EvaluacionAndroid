package com.example.aplicacioncreciendoseguro;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.content.Intent;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button btnAge1to3 = findViewById(R.id.btn1a3años);
        Button btnAge4to6 = findViewById(R.id.btn4a6años);
        Button btnAge6to10 = findViewById(R.id.btn6a10años);
        Button btnAge11plus = findViewById(R.id.btn11añosmas);


        btnAge1to3.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, unoatres.class);
            startActivity(intent);
        });

        btnAge4to6.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, cuatroaseis.class);
            startActivity(intent);
        });

        btnAge6to10.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, seisadiez.class);
            startActivity(intent);
        });

        btnAge11plus.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, onceomas.class);
            startActivity(intent);
        });
    }
}