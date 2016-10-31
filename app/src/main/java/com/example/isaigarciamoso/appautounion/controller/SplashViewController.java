package com.example.isaigarciamoso.appautounion.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.example.isaigarciamoso.appautounion.R;
import com.example.isaigarciamoso.appautounion.tools.ToolsOperations;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by isaigarciamoso on 21/10/16.
 */
public class SplashViewController extends AppCompatActivity {
    private int SPLASH_SCREEN_DELAY = 700;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash);
        //Temporizador
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(SplashViewController.this,MainActivityController.class);
                startActivity(intent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task,SPLASH_SCREEN_DELAY);

    }
}
