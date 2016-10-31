package com.example.isaigarciamoso.appautounion.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.example.isaigarciamoso.appautounion.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by isaigarciamoso on 28/10/16.
 */
public class MapViewController extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mapaGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.location_map);

        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(MapViewController.this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapaGoogle = googleMap;
        googleMap.addMarker(new MarkerOptions().position(new LatLng(18.9344326, -99.20811429999998)).
                title("Audi Cuernavaca").icon(BitmapDescriptorFactory.fromResource(R.drawable.car)));
        //googleMap.addMarker(new MarkerOptions().position()
        // boolean success = mapaGoogle.setMa
        // boolean success = mapaGoogle.setMapStyle(new MapStyleOptions(getResources().getString(R.raw.style_mapa)));
        boolean success = mapaGoogle.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, R.raw.style_mapa));

    }

    //
}
