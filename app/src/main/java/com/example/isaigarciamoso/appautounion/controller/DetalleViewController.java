package com.example.isaigarciamoso.appautounion.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
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
import com.example.isaigarciamoso.appautounion.adapter.AdapterAgencia;
import com.example.isaigarciamoso.appautounion.adapter.AdapterDatos;
import com.example.isaigarciamoso.appautounion.adapter.AdapterPageView;
import com.example.isaigarciamoso.appautounion.models.DataFicha;
import com.example.isaigarciamoso.appautounion.tools.GuiTools;
import com.example.isaigarciamoso.appautounion.tools.ToolsOperations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by isaigarciamoso on 20/10/16.
 */
public class DetalleViewController extends AppCompatActivity implements ViewPager.OnPageChangeListener, View.OnClickListener {

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
    private ListView listViewFichaTecnica2;
    private ArrayAdapter<String> adapter;
    private AdapterDatos adapterDatos;
    private AdapterDatos adapterDatos2;
    private ArrayList arrayListDatos;
    private DataFicha dataFicha;
    private List<DataFicha> x;
    private List<DataFicha> x2;
    private ViewPager viewPagerImgCar;
    private View view;
    private ImageButton buttonNext;
    private ImageButton buttonBack;
    private AdapterAgencia adapterAgencia;
    private LinearLayout linerLayoutItemViewPager;
    private RelativeLayout relativeLayoutViewPager;
    private int dotCounts;
    private ImageView[] dots;
    private AdapterPageView adapterPageView;
    private Button buttonWhatsapp;


    private int imagesCarArray[] = {
            R.drawable.m1,
            R.drawable.m2,
            R.drawable.m3,
            R.drawable.m4,
            R.drawable.m5,


    };


    private String[] fichaTecnicaArray = {"Color Exterior: Negro",
            "Color Interior: Negro", "Tipo de Motor: 1.4T",
            "Transmisión: Automática"};

    private String[] fichaTecnicaArray2 = {"Modelo: R8", "Versión: S-TRONIC", "Año: 2016",
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
    }

    /***
     * :::::::::::: Click de los botones :::::::::::::::
     **/
    View.OnClickListener clickListenerActividadAnterior = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivityController.class);
            startActivity(intent);
            finish();
        }
    };

    public void findViews() {
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
        //imgAuto = (ImageView) findViewById(R.id.img_auto);
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
        separador2 = (LinearLayout) findViewById(R.id.separator2);
        buttonBackActivity = (ImageButton) findViewById(R.id.barImage1);
        buttonBackActivity.setOnClickListener(clickListenerActividadAnterior);
        listViewFichaTecnica = (ListView) findViewById(R.id.list_view_ficha_tecnica);
        listViewFichaTecnica2 = (ListView) findViewById(R.id.list_view_ficha_tecnica2);
        viewPagerImgCar = (ViewPager) findViewById(R.id.viewPager_img_car);

        linerLayoutItemViewPager = (LinearLayout) findViewById(R.id.viewPagerCountDots);
        relativeLayoutViewPager = (RelativeLayout) findViewById(R.id.viewPagerIndicator);
        buttonNext = (ImageButton) findViewById(R.id.btn_next);
        buttonBack = (ImageButton) findViewById(R.id.btn_finish);

        adapterPageView = new AdapterPageView(this, imagesCarArray);

        viewPagerImgCar.setAdapter(adapterPageView);
        viewPagerImgCar.setCurrentItem(0);
        viewPagerImgCar.setOnPageChangeListener(this);
        buttonWhatsapp = (Button) findViewById(R.id.whatsapp);
        buttonWhatsapp.setOnClickListener(this);
        setUiPageViewController();


        //adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fichaTecnica);

        arrayListDatos = new ArrayList<>();
        //dataFicha = new DataFicha();

        /*dataFicha.setDataFicha("Color Exterior: Negro");
        dataFicha.setDataFicha("Tipo de Motor: 1.4T");
        dataFicha.setDataFicha("Transmisión: Automática");
        dataFicha.setDataFicha("Modelo: R8");
        dataFicha.setDataFicha("Versión: S-TRONIC");
        dataFicha.setDataFicha("Año: 2016");
        dataFicha.setDataFicha("Versión: S-TRONIC");
        dataFicha.setDataFicha("Combustible: Gasolina");*/

        int i = 0;

        x = new ArrayList<>();
        while (i < fichaTecnicaArray.length) {
            dataFicha = new DataFicha();
            dataFicha.setDataFicha(fichaTecnicaArray[i]);
            Log.d("VALORES --->", fichaTecnicaArray[i]);
            x.add(dataFicha);
            Log.d("valores", String.valueOf(x.get(i)));
            i++;
        }
        adapterDatos = new AdapterDatos(this, x);
        listViewFichaTecnica.setAdapter(adapterDatos);
        int j = 0;
        x2 = new ArrayList<>();
        while (j < fichaTecnicaArray2.length) {
            dataFicha = new DataFicha();
            dataFicha.setDataFicha(fichaTecnicaArray2[j]);
            Log.d("VALORES --->", fichaTecnicaArray2[j]);
            x2.add(dataFicha);
            Log.d("valores", String.valueOf(x2.get(j)));
            j++;
        }
        adapterDatos2 = new AdapterDatos(this, x2);
        listViewFichaTecnica2.setAdapter(adapterDatos2);
        // adapterDatos = new AdapterDatos(this, x);
        // listViewFichaTecnica.setAdapter(adapterDatos);
        //x.add(dataFicha);
        //listViewFichaTecnica.setAdapter(adapterDatos);
        //listViewFichaTecnica.setAdapter(adapter);
        //listViewFichaTecnica2.setAdapter(adapter);
    }

    /****
     * Configurar pantalla
     ***/
    private void configurarPantalla() {
        GuiTools gTools = GuiTools.getCurrent();
        gTools.init(getWindowManager());
        gTools.scale(padreLayoutDetalle);
        gTools.scale(padreCardViewAuto);
        gTools.scale(linerLayoutImagen);
        gTools.scale(imgAuto);
        gTools.scale(linearLayout1);
        gTools.scale(linearLayout2);
        gTools.scale(tituloAuto, true);
        gTools.scale(imgLike);
        gTools.scale(relativeLayout1);
        gTools.scale(precioAuto, true);
        gTools.scale(kilometros, true);
        gTools.scale(cardViewHorizontal);
        gTools.scale(layoutScrollHorizontal);
        gTools.scale(itemHorizontalScrollView);
        gTools.scale(separador);
        gTools.scale(cardViewFichaTecnica);
        gTools.scale(linearLayoutFichaTecnica);
        gTools.scale(linearLayoutSeccionConbustible);
        gTools.scale(imgConbustible);
        gTools.scale(dataConbustible);
        gTools.scale(textConbustible, true);
        gTools.scale(anio, true);
        gTools.scale(linearLayoutDetalleMotor);
        gTools.scale(imgMotor);
        gTools.scale(linearLayoutDataMotor);
        gTools.scale(tipoMotor, true);
        gTools.scale(transmicion, true);
        gTools.scale(separador2);
        gTools.scale(listViewFichaTecnica);
        gTools.scale(listViewFichaTecnica2);
        gTools.scale(linerLayoutItemViewPager);
        gTools.scale(relativeLayoutViewPager);
        gTools.scale(buttonNext);
        gTools.scale(buttonBack);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        for (int i = 0; i < dotCounts; i++) {
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.noselected_item_oval));
        }
        dots[position].setImageDrawable(getResources().getDrawable(R.drawable.selected_item_oval));
        if (position + 1 == dotCounts) {
            buttonNext.setVisibility(View.GONE);
            buttonBack.setVisibility(View.VISIBLE);
        } else {
            buttonNext.setVisibility(View.VISIBLE);
            buttonBack.setVisibility(View.GONE);
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    private void setUiPageViewController() {

        dotCounts = adapterPageView.getCount();
        dots = new ImageView[dotCounts];

        for (int i = 0; i < dotCounts; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(getResources().getDrawable(R.drawable.noselected_item_oval));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            params.setMargins(4, 0, 4, 0);

            linerLayoutItemViewPager.addView(dots[i], params);
        }

        dots[0].setImageDrawable(getResources().getDrawable(R.drawable.selected_item_oval));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_next:
                viewPagerImgCar.setCurrentItem((viewPagerImgCar.getCurrentItem() < dotCounts)
                        ? viewPagerImgCar.getCurrentItem() + 1 : 0);
                break;

            case R.id.btn_finish:
                finish();
                break;

            case R.id.whatsapp:
                ToolsOperations.showAlerDialogError(R.string.error,R.string.warning_mensaje_correo,this);

                break;
        }
    }
}