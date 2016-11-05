package com.run.practicasandroid.utiles;

public class UtilesValor
{
    private static final String NOMBRE_CLASE = "UtilesValor";

    public static boolean niVacioNiNulo(String parametro)
    {
        return parametro != null && !parametro.isEmpty();
    }

    public static Double obtenerNumerico(String parametro)
    throws NumberFormatException
    {
        //TODO
        return Double.parseDouble(parametro);
    }
}