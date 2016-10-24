package com.example.isaigarciamoso.appautounion.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.isaigarciamoso.appautounion.R;

/**
 * Created by isaigarciamoso on 20/10/16.
 */
public class DetalleViewController extends AppCompatActivity {
    private ImageButton buttonBackActivity;
    private HorizontalScrollView horizontalScrollView;
    private LinearLayout itemHorizontalScrollView;
    private Button itemButton;

    private int arrayImages[] = {R.drawable.whatsapp,
            R.drawable.message,
            R.drawable.phone,
            R.drawable.money,
            R.drawable.time};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_auto);

        buttonBackActivity = (ImageButton) findViewById(R.id.barImage1);
        buttonBackActivity.setOnClickListener(clickListenerActividadAnterior);
        horizontalScrollView = (HorizontalScrollView) findViewById(R.id.horizontalScrollView);
        itemHorizontalScrollView = (LinearLayout) findViewById(R.id.item_horizontalScrollView);

        /*for (int i = 0; i < 4; i++) {
            itemButton = new Button(this);
            itemButton.setWidth(25);
            itemButton.setHeight(25);
            itemButton.setPadding(6,6,6,6);
            itemButton.setBackgroundResource(arrayImages[i]);
            itemHorizontalScrollView.addView(itemButton);
        }*/
    }
    /** :::::::::::: Click de los botones :::::::::::::::**/
    View.OnClickListener clickListenerActividadAnterior = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivityController.class);
            startActivity(intent);
            finish();
        }
    };
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

}
