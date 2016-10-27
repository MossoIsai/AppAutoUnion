package com.example.isaigarciamoso.appautounion.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.isaigarciamoso.appautounion.R;
import com.example.isaigarciamoso.appautounion.models.Agencia;
import com.example.isaigarciamoso.appautounion.models.DataFicha;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by isaigarciamoso on 26/10/16.
 */
public class AdapterDatos extends ArrayAdapter<DataFicha> {
    private TextView textData;

    public AdapterDatos(Context context, List<DataFicha> dataFichaTecnica) {
        super(context, 0, dataFichaTecnica);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vista = convertView;

        if (convertView == null) {
           vista =  layoutInflater.inflate(R.layout.item_character, parent,false);
        }
        textData = (TextView)vista.findViewById(R.id.text_data_fichaTecnica);
        DataFicha dataFicha = (DataFicha) getItem(position);
        textData.setText(dataFicha.getDataFicha());
        return vista;

        //5558149393
       //$2011 pesos en tarjeta si vale
    }
}
