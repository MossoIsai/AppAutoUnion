package com.example.isaigarciamoso.appautounion.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.isaigarciamoso.appautounion.R;
/**
 * Created by isaigarciamoso on 24/10/16.
 */
public class AdapterDatos<T> extends ArrayAdapter {

   private TextView labelData1;
   private TextView labelData2;
   private ImageView imgData;

    public AdapterDatos(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista =  convertView;

        LayoutInflater inflater  = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null){
            vista = inflater.inflate(R.layout.item_character,parent);
        }
        /**Vinculación de vistas*/
        labelData1 = (TextView)vista.findViewById(R.id.data_one);
        labelData2 = (TextView)vista.findViewById(R.id.data_two);
        imgData = (ImageView)vista.findViewById(R.id.img_data);

        return vista;
    }
}
