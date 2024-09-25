package com.example.aplicacioncreciendoseguro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityEntrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);


        Button btnContinuar = findViewById(R.    id.btnContinuar);


        btnContinuar.setOnClickListener(v -> {

            Intent intent = new Intent(ActivityEntrar.this, MenuActivity.class);
            startActivity(intent);
        });
    }
}
