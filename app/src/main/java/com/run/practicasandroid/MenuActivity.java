package com.run.practicasandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuActivity
extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        inicializarNavegacionBotones();
    }

    private void inicializarNavegacionBotones()
    {
        Button buttonActividad01 = (Button) findViewById(R.id.btActividad01);

        buttonActividad01.setOnClickListener
        (
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(MenuActivity.this, Actividad01Activity.class);
                        startActivity(intent);
                    }
                }
        );

        Button buttonActividad02 = (Button) findViewById(R.id.btActividad02);

        buttonActividad02.setOnClickListener
        (
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(MenuActivity.this, Actividad02Activity.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
