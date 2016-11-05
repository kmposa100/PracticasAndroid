package com.run.practicasandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.run.practicasandroid.utiles.UtilesValor;

public class Actividad01Activity
extends AppCompatActivity
{
    private EditText etNumero1;
    private EditText etNumero2;
    private TextView txResultadoMostrar;
    private TextView txMensajeError;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad01);
//TODO
        inicializarElementos();
    }

    public void suma(View view)
    {
        operar("+");
    }

    public void resta(View view)
    {
        operar("-");
    }

    public void multiplica(View view)
    {
        operar("*");
    }

    public void divide(View view)
    {
        operar("/");
    }


    private void inicializarElementos()
    {
        etNumero1           = (EditText) findViewById(R.id.etNumero1);
        etNumero2           = (EditText) findViewById(R.id.etNumero2);
        txResultadoMostrar  = (TextView) findViewById(R.id.txResultadoMostrar);
        txMensajeError      = (TextView) findViewById(R.id.txMensajeError);
    }

    private Double obtenerValor(EditText etNumero)
    throws NumberFormatException
    {
        CharSequence csNumero   = etNumero.getText();
        String sNumero          = csNumero.toString();
        return UtilesValor.obtenerNumerico(sNumero);
    }

    private void operar(String operacion)
    {
        //Vacíamos mensaje de error y resultado
        txMensajeError.setText("");
        txResultadoMostrar.setText("");

        boolean bHayError = false;

        Double dValor1      = null;
        Double dValor2      = null;

        try
        {
            dValor1 = obtenerValor(etNumero1);
        }

        catch(Exception eException)
        {
            txMensajeError.setText("Número 1 no informado correctamente");
            bHayError = true;
        }

        if(!bHayError)
        {
            try
            {
                dValor2 = obtenerValor(etNumero2);
            }

            catch (Exception eException)
            {
                txMensajeError.setText("Número 2 no informado correctamente");
                bHayError = true;
            }

            if(!bHayError)
            {
                Double dResultado = null;

                switch (operacion)
                {
                    case "+":
                    {
                        dResultado = dValor1 + dValor2;
                        break;
                    }

                    case "-":
                    {
                        dResultado = dValor1 - dValor2;
                        break;
                    }

                    case "*":
                    {
                        dResultado = dValor1 * dValor2;
                        break;
                    }

                    case "/":
                    {
                        if(dValor2 != 0)
                        {
                            dResultado = dValor1 / dValor2;
                        }

                        else
                        {
                            txMensajeError.setText("El divisor no puede ser 0");
                            bHayError = true;
                        }

                        break;
                    }

                    default:
                    {
                        txMensajeError.setText("Operación no seleccionada");
                    }
                }

                if(!bHayError)
                {
                    txResultadoMostrar.setText(dResultado.toString());
                }
            }
        }
    }
}