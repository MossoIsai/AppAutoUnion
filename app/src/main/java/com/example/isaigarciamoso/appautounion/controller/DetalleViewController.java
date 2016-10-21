package com.example.isaigarciamoso.appautounion.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.isaigarciamoso.appautounion.R;
/**
 * Created by isaigarciamoso on 20/10/16.
 */
public class DetalleViewController extends AppCompatActivity {
    private ImageButton buttonBackActivity;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_auto);

        buttonBackActivity = (ImageButton)findViewById(R.id.barImage1);
        buttonBackActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivityController.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
