package com.example.aplicacioncreciendoseguro;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerIntereses = findViewById(R.id.Intereses);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Intereses_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerIntereses.setAdapter(adapter);

        Button btnContinue = findViewById(R.id.btnIniciar);

        btnContinue.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityEntrar.class);
            startActivity(intent);
        });
    }
}
