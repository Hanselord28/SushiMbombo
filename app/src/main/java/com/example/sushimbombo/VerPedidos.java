package com.example.sushimbombo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class VerPedidos extends AppCompatActivity {

    private ListView lvPedidos;
    private PedidoAdapter adapter;
    private List<Pedido> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_pedidos);

        lvPedidos = findViewById(R.id.lvPedidos);


        data = GestorPedidos.getPedidos();


        adapter = new PedidoAdapter(this, data);
        lvPedidos.setAdapter(adapter);


        lvPedidos.setOnItemClickListener((parent, view, position, id) -> {
            Pedido p = data.get(position);
            String msg = "Mesa " + p.getIdMesa() + " | " + p.getTipo()
                    + " | $" + p.getPrecio() + " | x" + p.getCantidad();
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        });


        if (data.isEmpty()) {
            Toast.makeText(this, "No hay pedidos. Agrega uno en Ingresar Pedido.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }


    private void irAIngresarPedido() {
        startActivity(new Intent(this, IngresarPedido.class));
    }
}
