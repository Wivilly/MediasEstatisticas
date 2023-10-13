package br.edu.ifsp.dmo.mediasestatisticas.model;

import java.util.ArrayList;

public class AritmeticaStrategy implements Media{
    private static AritmeticaStrategy instance;

    public AritmeticaStrategy(){}

    public static AritmeticaStrategy getInstance(){
        if(instance == null){
            instance = new AritmeticaStrategy();
        }
        return instance;
    }

    @Override
    public double media(ArrayList<Double> media) throws NumberFormatException{
        double mediaAritmetica = 0;

        for(int i = 0; i < media.size(); i++)
            mediaAritmetica += media.get(i);

        mediaAritmetica = mediaAritmetica / 5;

        return mediaAritmetica;
    }

    /*public Double[] aritmetica = new Double[5];

    public void calcularMedia(){
        double resultado = 0;

        for(int i = 0; i < aritmetica.length; i++){
            resultado += aritmetica[i];
        }

        resultado = resultado/5;
    }*/
}
