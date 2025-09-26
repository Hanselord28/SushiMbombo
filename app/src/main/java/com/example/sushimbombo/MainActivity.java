package com.example.sushimbombo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnIngresar = findViewById(R.id.btnIrIngresarPedido);
        Button btnVer = findViewById(R.id.btnVerPedidos);

        btnIngresar.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, IngresarPedido.class)));

        btnVer.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, VerPedidos.class)));
    }
}
