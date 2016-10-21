package com.example.isaigarciamoso.appautounion.controller;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.isaigarciamoso.appautounion.R;

public class MainActivityController extends AppCompatActivity {

    private CardView vistaEjemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UI();
    }

    public void UI(){
      vistaEjemplo = (CardView)findViewById(R.id.card_view);
      vistaEjemplo.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent intent = new Intent(getApplicationContext(),DetalleViewController.class);
              startActivity(intent);
              finish();
          }
      });
    }

}