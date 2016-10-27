package com.example.isaigarciamoso.appautounion.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.isaigarciamoso.appautounion.R;
import com.example.isaigarciamoso.appautounion.models.Agencia;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by isaigarciamoso on 24/10/16.
 */
public class AdapterAgencia<T> extends ArrayAdapter<Agencia> {

    private static final String URL_IMAGENES_RAIZ = "http://ListaGeneralIconos=";

    private TextView nombre;
    private TextView domicilio;
    private ImageView logoEmpresa,imgPhone;
    public AdapterAgencia(Context context, List<Agencia> itemAgencia) {
        super(context, 0, itemAgencia);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater =
                (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View vista = convertView;

        if(convertView ==  null){
          vista = inflater.inflate(R.layout.item_character,parent,false);
        }

        //Vinculación de las vistas
        nombre = (TextView)vista.findViewById(R.id.nombre_agencia);
        domicilio = (TextView)vista.findViewById(R.id.direccion_agencia);
        logoEmpresa = (ImageView)vista.findViewById(R.id.logo_agencia);
        imgPhone = (ImageView)vista.findViewById(R.id.phone_agencia);

        return  vista;
    }
    //Cargador de las imagenes
    public void loadBitmap(String nameImage, ImageView imageView){
        URL url  = null;
        try {
            url =  new URL(URL_IMAGENES_RAIZ+nameImage+".jpg");
            Bitmap bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            imageView.setImageBitmap(bitmap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
