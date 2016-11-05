package com.run.practicasandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.run.practicasandroid.utiles.UtilesValor;

public class Actividad02Activity
extends AppCompatActivity
{
    private EditText etClase;
    private EditText etTraza;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02);

        inicializarElementos();
    }

    public void escribirLog(View view)
    {
        String sClase = etClase.getText().toString();
        String sTraza = etTraza.getText().toString();

        if(!UtilesValor.niVacioNiNulo(sClase))
        {
            sClase = this.getClass().getName();
        }

        escribirLogError(sClase, sTraza);
        escribirLogWarning(sClase, sTraza);
        escribirLogInfo(sClase, sTraza);
        escribirLogDebug(sClase, sTraza);
        escribirLogVerbose(sClase, sTraza);
    }

    private void inicializarElementos()
    {
        etClase = (EditText) findViewById(R.id.etClase);
        etTraza = (EditText) findViewById(R.id.etTraza);
    }

    private void escribirLogError(String param1, String param2)
    {
        Log.e(param1, "Traza error: " + param2);
    }

    private void escribirLogWarning(String param1, String param2)
    {
        Log.w(param1, "Traza warning: " + param2);
    }

    private void escribirLogInfo(String param1, String param2)
    {
        Log.i(param1, "Traza info: " + param2);
    }

    private void escribirLogDebug(String param1, String param2)
    {
        Log.d(param1, "Traza debug: " + param2);
    }

    private void escribirLogVerbose(String param1, String param2)
    {
        Log.v(param1, "Traza verbose: " + param2);
    }
}