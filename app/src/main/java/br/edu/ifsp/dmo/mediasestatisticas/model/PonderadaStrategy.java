package br.edu.ifsp.dmo.mediasestatisticas.model;

import java.util.ArrayList;

public class PonderadaStrategy implements Media{

    private static PonderadaStrategy instance;

    public PonderadaStrategy(){}

    public static PonderadaStrategy getInstance() {
        if(instance == null){
            instance = new PonderadaStrategy();
        }
        return instance;
    }

    @Override
    public double media(ArrayList<Double> media) {
        double mediaPonderada = 0;
        double dividendo = 0;
        double divisor = 0;
        double peso = 1;

        for (int i = 0; i < media.size(); i++){
            dividendo += peso * media.get(i);
            divisor += media.get(i);
        }

        mediaPonderada = dividendo / divisor;
        return mediaPonderada;
    }
}
