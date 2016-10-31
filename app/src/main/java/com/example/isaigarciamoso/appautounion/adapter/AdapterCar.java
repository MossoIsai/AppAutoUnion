package com.example.isaigarciamoso.appautounion.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.isaigarciamoso.appautounion.R;
import com.example.isaigarciamoso.appautounion.models.Auto;

import java.util.List;

/**
 * Created by isaigarciamoso on 30/10/16.
 */
public class AdapterCar extends RecyclerView.Adapter<AdapterCar.ViewHolder> {
    private List<Auto> listaAutos;


    public AdapterCar(List<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_car
                        , parent,
                        false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Auto autoItem = listaAutos.get(position);
        holder.titulo.setText(autoItem.getMarca()+" "+autoItem.getModelo()+" "+autoItem.getVersion());
        holder.precio.setText(autoItem.getPrecio());
        holder.anioKilometro.setText(autoItem.getAnio()+"|"+ autoItem.getKilometraje()+"Km");
        holder.transmision.setText(autoItem.getTransmicion());
        holder.agencia.setText(autoItem.getAgeciaAuto());
        holder.estatusAuto.setText(autoItem.getTipoAuto());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView titulo;
        private TextView precio;
        private TextView anioKilometro;
        private TextView transmision;
        private TextView agencia;
        private TextView estatusAuto;

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }


}
