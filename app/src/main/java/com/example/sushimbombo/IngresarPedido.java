package com.example.sushimbombo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class IngresarPedido extends AppCompatActivity {

    private EditText txtIDMesa, txtPack, txtPrecio, txtCantidad;
    private Button btnAgregarPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_pedido);

        EditText txtIDMesa   = findViewById(R.id.txtIDMesa);
        EditText txtPack     = findViewById(R.id.txtPack);
        EditText txtPrecio   = findViewById(R.id.txtPrecio);
        EditText txtCantidad = findViewById(R.id.txtCantidad);
        Button btnAgregar    = findViewById(R.id.btnAgregarPedido);

        btnAgregar.setOnClickListener(v -> {
            try {
                String packStr = txtPack.getText().toString().trim();
                int idMesa     = Integer.parseInt(txtIDMesa.getText().toString().trim());
                int precio     = Integer.parseInt(txtPrecio.getText().toString().trim());
                int cantidad   = Integer.parseInt(txtCantidad.getText().toString().trim());

                if (packStr.isEmpty()) {
                    Toast.makeText(this, "Ingresa el Pack", Toast.LENGTH_SHORT).show();
                    return;
                }

                Pedido p = new Pedido(idMesa, packStr, precio, cantidad);
                GestorPedidos.agregar(p);


                Toast.makeText(this, "Pedido agregado", Toast.LENGTH_SHORT).show();
                txtIDMesa.setText("");
                txtCantidad.setText("");
                txtPack.setText("");
                txtPrecio.setText("");


            } catch (NumberFormatException e) {
                Toast.makeText(this, "Mesa/Precio/Cantidad deben ser números", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
