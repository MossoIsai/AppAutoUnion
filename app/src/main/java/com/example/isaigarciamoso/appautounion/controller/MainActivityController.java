package com.example.isaigarciamoso.appautounion.controller;

import android.content.Intent;
import android.graphics.Typeface;
import android.renderscript.Type;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.isaigarciamoso.appautounion.R;
import com.example.isaigarciamoso.appautounion.tools.GuiTools;

public class MainActivityController extends AppCompatActivity {

    private CardView cardView;
    private ImageView corazon;
    private ImageView imgAuto;
    private LinearLayout linearLayout;
    private LinearLayout linearLayout_car;
    private LinearLayout linearLayoutInformationCar;
    private RelativeLayout relativeLayout;
    private TextView titulo;
    private TextView precio;
    private TextView anioKilometro;
    private TextView transmicion;
    private TextView nombreAgencia;
    private TextView statusAuto;
    private ImageButton backButton;
    private ImageButton asistenciaButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    public void findViews(){
        UI();
        configurarPantalla();
    }

    public void UI() {

        cardView = (CardView) findViewById(R.id.card_view_lista);
        corazon = (ImageView) findViewById(R.id.corazon);
        linearLayout = (LinearLayout) findViewById(R.id.frameLayout);
        relativeLayout = (RelativeLayout) findViewById(R.id.relative_layout_text);
        linearLayout_car  = (LinearLayout)findViewById(R.id.item_car);
        linearLayoutInformationCar = (LinearLayout)findViewById(R.id.layout_text_information);
        imgAuto = (ImageView)findViewById(R.id.imagen_auto);
        titulo = (TextView)findViewById(R.id.titulo_car);
        precio = (TextView)findViewById(R.id.precio);
        anioKilometro = (TextView)findViewById(R.id.anio_kilometro);
        transmicion = (TextView)findViewById(R.id.transmicion);
        nombreAgencia = (TextView)findViewById(R.id.nombre_agencia);
        backButton = (ImageButton)findViewById(R.id.barImage1);
        asistenciaButton = (ImageButton)findViewById(R.id.barImage2);
        statusAuto = (TextView)findViewById(R.id.status_auto);

        backButton.setVisibility(View.GONE);
        asistenciaButton.setBackgroundResource(R.mipmap.mas_opciones);


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/exo_font.otf");
        precio.setTypeface(typeface);

        Typeface typeface1 = Typeface.createFromAsset(getAssets(),"fonts/libre2.ttf");
        statusAuto.setTypeface(typeface1);







        corazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "XXX", Toast.LENGTH_LONG).show();
                corazon.setBackgroundResource(R.drawable.corazon);
            }
        });
        cardView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent intent = new Intent(getApplicationContext(),DetalleViewController.class);
              startActivity(intent);
              finish();
          }
      });
    }

    private void configurarPantalla() {
        GuiTools gTools = GuiTools.getCurrent();
        gTools.init(getWindowManager());
        //gTools.scale();


        gTools.scale(cardView);
        gTools.scale(corazon);
        gTools.scale(linearLayout);
        gTools.scale(relativeLayout);
        gTools.scale(linearLayout_car);
        gTools.scale(linearLayoutInformationCar);
        gTools.scale(imgAuto);

        gTools.scale(titulo,true);
        gTools.scale(precio,true);
        gTools.scale(anioKilometro,true);
        gTools.scale(transmicion,true);
        gTools.scale(nombreAgencia,true);
        gTools.scale(statusAuto,true);

    }


}
