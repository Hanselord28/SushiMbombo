package com.example.sushimbombo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.*;

import java.util.List;

public class PedidoAdapter extends ArrayAdapter<Pedido> {
    public PedidoAdapter(Context ctx, List<Pedido> pedidos) {
        super(ctx, 0, pedidos);
    }

    @NonNull @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_pedido, parent, false);
        }

        Pedido p = getItem(position);

        TextView tvMesa     = convertView.findViewById(R.id.tvMesa);
        TextView tvPack     = convertView.findViewById(R.id.tvPack);
        TextView tvPrecio   = convertView.findViewById(R.id.tvPrecio);
        TextView tvCantidad = convertView.findViewById(R.id.tvCantidad);

        if (p != null) {
            tvMesa.setText(String.valueOf(p.getIdMesa()));
            tvPack.setText(p.getTipo());
            tvPrecio.setText("$" + p.getPrecio());
            tvCantidad.setText(String.valueOf(p.getCantidad()));
        }

        return convertView;
    }
}
