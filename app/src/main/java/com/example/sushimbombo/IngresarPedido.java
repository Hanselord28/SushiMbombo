package com.example.sushimbombo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.*;


public class IngresarPedido extends AppCompatActivity {
    //instancia desde el layout los campos y boton
    private EditText txtIDMesa, txtPack, txtPrecio, txtCantidad;
    private Button btnAgregarPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_pedido);


    //vinculacion de los componentes de la interfaz grafica
    Button oButtonIngresarPedido = findViewById(R.id.btnIngresarPedido);
    txtIDMesa = findViewById(R.id.txtIDMesa);
    txtPack = findViewById(R.id.txtPack);
    txtCantidad = findViewById(R.id.txtCantidad);
    txtPrecio = findViewById(R.id.txtPrecio);
    btnAgregarPedido = findViewById(R.id.btnAgregarPedido);




        //Boton Ingresar Pedido y su logica
    oButtonIngresarPedido.setOnClickListener(view -> {

        try {

           //recibe los datos de los campos y los guarda en variables temporales
            String pck = txtPack.getText().toString().trim();
            int IdM = Integer.parseInt(txtIDMesa.getText().toString().trim());
            int prs = Integer.parseInt(txtPrecio.getText().toString().trim());
            int cant = Integer.parseInt(txtCantidad.getText().toString().trim());

            //le entrega las variables temporales al constructor vacio y los agrega al objeto oPedido

            Pedido oPedido = new Pedido(pck, IdM, prs,cant);


            //un toast para confirmar que se agrego el pedido
            Toast.makeText(this, "Pedido agregado", Toast.LENGTH_SHORT).show();

            // limpiar campos
            txtIDMesa.setText("");
            txtPack.setText("");
            txtPrecio.setText("");
            txtCantidad.setText("");


        } catch (Exception e) {
            Toast.makeText(this, "Verifica los datos ingresados", Toast.LENGTH_SHORT).show();
        }});

    }
}