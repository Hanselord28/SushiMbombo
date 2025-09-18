package com.example.sushimbombo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //boton trans a Ingresar Pedido (Menu Principal)
        Button oButton = findViewById(R.id.btnIngresarPedido);

        oButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, IngresarPedido.class);
            startActivity(intent);
        });
        //Boton trans a activity verPedidos
        Button oButtonVerPedidos = findViewById(R.id.btnVerPedidos);
        oButtonVerPedidos.setOnClickListener(view -> {
            Intent intent = new Intent(this,VerPedidos.class);
            startActivity(intent);
        });

    }
}