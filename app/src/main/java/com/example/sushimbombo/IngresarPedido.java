package com.example.sushimbombo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CheckBox;
import android.widget.*;
import java.util.ArrayList;



public class IngresarPedido extends AppCompatActivity {

    private EditText txtIDMesa, txtCobertura, txtRelleno1, txtRelleno2, txtRelleno3, txtCantidad;
    private CheckBox chkChimbombo;
    private Button btnAgregarPedido;



   // private ArrayList<Pedido> listaPedidos;
    //private ArrayAdapter<Pedido> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_pedido);


    //vinculacion de los componentes de la interfaz grafica
    Button oButtonIngresarPedido = findViewById(R.id.btnIngresarPedido);
    txtIDMesa = findViewById(R.id.txtIDMesa);
    txtCobertura = findViewById(R.id.txtCobertura);
    txtRelleno1 = findViewById(R.id.txtRelleno1);
    txtRelleno2 = findViewById(R.id.txtRelleno2);
    txtRelleno3 = findViewById(R.id.txtRelleno3);
    txtCantidad = findViewById(R.id.txtCantidad);
    chkChimbombo = findViewById(R.id.chkChimbombo);
    btnAgregarPedido = findViewById(R.id.btnAgregarPedido);




        //Boton Ingresar Pedido y su logica
    oButtonIngresarPedido.setOnClickListener(view -> {

        try {

            String cob = txtCobertura.getText().toString().trim();
            String re1 = txtRelleno1.getText().toString().trim();
            String re2 = txtRelleno2.getText().toString().trim();
            String re3 = txtRelleno3.getText().toString().trim();
            int ca1 = Integer.parseInt(txtCantidad.getText().toString().trim());
            boolean chimbombo1 = chkChimbombo.isChecked();

            Pedido oPedido = new Pedido(cob, re1, re2, re3, ca1, chimbombo1);



            Toast.makeText(this, "Pedido agregado", Toast.LENGTH_SHORT).show();

            // limpiar campos
            txtCobertura.setText("");
            txtRelleno1.setText("");
            txtRelleno2.setText("");
            txtRelleno3.setText("");
            txtCantidad.setText("");
            chkChimbombo.setChecked(false);

        } catch (Exception e) {
            Toast.makeText(this, "Verifica los datos ingresados", Toast.LENGTH_SHORT).show();
        }});

    }
}