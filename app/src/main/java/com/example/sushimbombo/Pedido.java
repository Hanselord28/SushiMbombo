package com.example.sushimbombo;

import android.media.tv.TvView;

public class Pedido {
    private int idMesa;       // usa primitivo para evitar null
    private String pack;
    private int precio;
    private int cantidad;

    public Pedido(int idMesa, String pack, int precio, int cantidad) {
        this.idMesa = idMesa;
        this.pack = pack;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdMesa()     { return idMesa; }
    public String getTipo()    { return pack; }
    public int getPrecio()     { return precio; }
    public int getCantidad()   { return cantidad; }
}

