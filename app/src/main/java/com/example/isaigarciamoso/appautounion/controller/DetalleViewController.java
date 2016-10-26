package com.example.isaigarciamoso.appautounion.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.isaigarciamoso.appautounion.R;
import com.example.isaigarciamoso.appautounion.tools.GuiTools;

/**
 * Created by isaigarciamoso on 20/10/16.
 */
public class DetalleViewController extends AppCompatActivity {

    private Button itemButton;
    private CardView cardViewFichaTecnica;
    private CardView padreCardViewAuto;
    private CardView cardViewHorizontal;
    private HorizontalScrollView horizontalScrollView;
    private ImageButton buttonBackActivity;
    private ImageView imgMotor;
    private ImageView imgAuto;
    private ImageView imgLike;
    private ImageView imgConbustible;
    private LinearLayout itemHorizontalScrollView;
    private LinearLayout padreLayoutDetalle;
    private LinearLayout linerLayoutImagen;
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout separador2;
    private LinearLayout layoutScrollHorizontal;
    private LinearLayout separador;
    private LinearLayout linearLayoutFichaTecnica;
    private LinearLayout linearLayoutSeccionConbustible;
    private LinearLayout linearLayoutDetalleMotor;
    private LinearLayout linearLayoutDataMotor;
    private LinearLayout dataConbustible;
    private TextView tituloAuto;
    private TextView precioAuto;
    private TextView kilometros;
    private TextView textConbustible;
    private TextView anio;
    private TextView tipoMotor;
    private TextView transmicion;
    private RelativeLayout relativeLayoutInfo;
    private RelativeLayout relativeLayout1;
    private ListView listViewFichaTecnica;
    private ArrayAdapter<String> adapter;


    /***ListView datos test*/
    private String conbustibleText;
    private String colorExteriorText;
    private String colorInteriorText;
    private String tipoMotorText;
    private String transmicionText;
    private String modeloText;
    private String versionText;
    private String anioText;

    private String[] fichaTecnica = {"Color Exterior: Negro",
            "Color Interior: Negro","Tipo de Motor: 1.4T",
    "Transmisión: Automatica","Modelo: R8","Versión: S-TRONIC","Año: 2016",
    "Combustible: Gasolina"};


    private int arrayImages[] = {R.drawable.whatsapp,
            R.drawable.message,
            R.drawable.phone,
            R.drawable.money,
            R.drawable.time};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_auto);

        findViews();

        /*for (int i = 0; i < 4; i++) {
            itemButton = new Button(this);
            itemButton.setWidth(25);
            itemButton.setHeight(25);
            itemButton.setPadding(6,6,6,6);
            itemButton.setBackgroundResource(arrayImages[i]);
            itemHorizontalScrollView.addView(itemButton);
        }*/
    }

    /*** :::::::::::: Click de los botones :::::::::::::::**/
    View.OnClickListener clickListenerActividadAnterior = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivityController.class);
            startActivity(intent);
            finish();
        }
    };



    public void findViews(){
        UI();
        configurarPantalla();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    public void UI() {

        padreLayoutDetalle = (LinearLayout) findViewById(R.id.padre_detalle_layout);
        padreCardViewAuto = (CardView) findViewById(R.id.card_view_auto);
        linerLayoutImagen = (LinearLayout) findViewById(R.id.linear_layout_imagen);
        imgAuto = (ImageView) findViewById(R.id.img_auto);
        linearLayout1 = (LinearLayout) findViewById(R.id.linear_layout_linea1);
        linearLayout2 = (LinearLayout) findViewById(R.id.linear2);
        relativeLayoutInfo = (RelativeLayout) findViewById(R.id.relative_layout_info);
        tituloAuto = (TextView) findViewById(R.id.marca_auto);
        imgLike = (ImageView) findViewById(R.id.img_like);
        relativeLayout1 = (RelativeLayout) findViewById(R.id.relative_layuot1);
        precioAuto = (TextView) findViewById(R.id.precio_car);
        kilometros = (TextView) findViewById(R.id.kilometraje_car);
        cardViewHorizontal = (CardView) findViewById(R.id.card_view_horizontal);
        layoutScrollHorizontal = (LinearLayout) findViewById(R.id.layout_scroll_horizontal);
        itemHorizontalScrollView = (LinearLayout) findViewById(R.id.item_horizontalScrollView);
        separador = (LinearLayout) findViewById(R.id.separator);
        cardViewFichaTecnica = (CardView) findViewById(R.id.card_view_ficha_tecnica);
        /*linearLayoutFichaTecnica = (LinearLayout) findViewById(R.id.linear_layout_ficha_tecnica);
        linearLayoutSeccionConbustible = (LinearLayout) findViewById(R.id.linear_seccion_conbustible);
        imgConbustible = (ImageView)findViewById(R.id.img_conbustible);
        dataConbustible = (LinearLayout)findViewById(R.id.data_conbustible);
        textConbustible = (TextView)findViewById(R.id.text_conbustible);
        anio = (TextView)findViewById(R.id.text_anio);
        linearLayoutDetalleMotor = (LinearLayout)findViewById(R.id.detalle_motor);
        imgMotor = (ImageView)findViewById(R.id.img_motor);
        linearLayoutDataMotor = (LinearLayout)findViewById(R.id.data_motor);
        tipoMotor = (TextView)findViewById(R.id.text_tipo_motor);
        transmicion = (TextView)findViewById(R.id.text_transmicion);*/
        separador2 = (LinearLayout)findViewById(R.id.separator2);
        buttonBackActivity = (ImageButton) findViewById(R.id.barImage1);
        buttonBackActivity.setOnClickListener(clickListenerActividadAnterior);
        listViewFichaTecnica = (ListView)findViewById(R.id.list_view_ficha_tecnica);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fichaTecnica);
        listViewFichaTecnica.setAdapter(adapter);



    }

    /*** Configurar pantalla**/
    private void configurarPantalla() {
        GuiTools gTools = GuiTools.getCurrent();
        gTools.init(getWindowManager());

        gTools.scale(padreLayoutDetalle);
        gTools.scale(padreCardViewAuto);
        gTools.scale(linerLayoutImagen);
        gTools.scale(imgAuto);
        gTools.scale(linearLayout1);
        gTools.scale(linearLayout2);
        gTools.scale(tituloAuto,true);
        gTools.scale(imgLike);
        gTools.scale(relativeLayout1);
        gTools.scale(precioAuto,true);
        gTools.scale(kilometros,true);
        gTools.scale(cardViewHorizontal);
        gTools.scale(layoutScrollHorizontal);
        gTools.scale(itemHorizontalScrollView);
        gTools.scale(separador);
        gTools.scale(cardViewFichaTecnica);
        gTools.scale(linearLayoutFichaTecnica);
        gTools.scale(linearLayoutSeccionConbustible);
        gTools.scale(imgConbustible);
        gTools.scale(dataConbustible);
        gTools.scale(textConbustible,true);
        gTools.scale(anio,true);
        gTools.scale(linearLayoutDetalleMotor);
        gTools.scale(imgMotor);
        gTools.scale(linearLayoutDataMotor);
        gTools.scale(tipoMotor,true);
        gTools.scale(transmicion,true);
        gTools.scale(separador2);
        gTools.scale(listViewFichaTecnica);

    }

}