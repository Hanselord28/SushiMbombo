package com.example.sushimbombo;

import java.util.ArrayList;
import java.util.List;


public class GestorPedidos {

    private static final ArrayList<Pedido> pedidos = new ArrayList<>();


    public static List<Pedido> getPedidos() {
        return pedidos;
    }


    public static void agregar(Pedido p) {
        pedidos.add(p);
    }


    public static void limpiar() {
        pedidos.clear();
    }
}
