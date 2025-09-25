package com.example.sushimbombo;

import android.media.tv.TvView;

public class Pedido {
    private Integer IdMesa;

    private String Pack;

    private int precio;

    private Integer Cantidad;



    public Pedido(String pck, int idM, int prs, int cant) {
    }

    public Pedido (Integer IdMesa, String Pack, int precio, Integer Cantidad) {
        this.Pack = Pack;
        this.precio = precio;
        this.Cantidad = Cantidad;
    }


    public String getTipo() {
        return Pack;
    }

    public void setTipo(String Pack) {
        Pack = Pack;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }
}
