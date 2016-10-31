package com.example.isaigarciamoso.appautounion.tools;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.example.isaigarciamoso.appautounion.*;

/**
 * Created by isaigarciamoso on 27/10/16.
 */

public class ToolsOperations extends AppCompatActivity {
    private static AlertDialog alertDialog;
    private static final String TITTLE_CONECTION_HTTP = "Espere un momento";
    private static final String MESSAGE_CONECTION_HTTP = "Conectando...";

    public void openWhatsapp(String phoneNumber) {

    }

    public void openMessage(String asunto, String correo, String cuerpoMail) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{correo});
        i.putExtra(Intent.EXTRA_SUBJECT, asunto);
        i.putExtra(Intent.EXTRA_TEXT, cuerpoMail);

        try {
            startActivity(Intent.createChooser(i, "Send mail"));
        } catch (android.content.ActivityNotFoundException ex) {
            showAlerDialogError(R.string.error, R.string.error_mensaje_whatsapp, getApplicationContext());
        } catch (Exception e) {
            showAlerDialogError(R.string.error, R.string.error_inesperado, getApplicationContext());
        }
    }

    public void openCall(String phoneNumber) {


    }

    /**
     * :::::::::::AlertDialog:::::::::::
     */
    public  static void showAlerDialogError(int titulo, int mensaje, Context context) {
        final String MESSAGE_BUTTON = "ACEPTAR";
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(titulo);
        builder.setMessage(mensaje);
        //builder.setIcon(R.drawable.error_img);
        builder.setCancelable(true);
        builder.setPositiveButton(MESSAGE_BUTTON, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        alertDialog = builder.create();
        alertDialog.show();
    }
    /**
     * ::::::::::::AlertDialog conecttion :::::::::.
     **/

    public void showAlerDialogConnectionHTTP(Context context) {
        final ProgressDialog progressDialog = new ProgressDialog(context);

        progressDialog.setTitle(TITTLE_CONECTION_HTTP);
        progressDialog.setMessage(MESSAGE_CONECTION_HTTP);
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(true);
        //progressDialog.setIcon(ICON_CONECTION_HTTP);
        progressDialog.show();
    }


}