package br.edu.ifsp.dmo.mediasestatisticas.model;

import java.util.ArrayList;

public class HarmonicaStrategy implements Media{

    private static HarmonicaStrategy instance;

    public HarmonicaStrategy(){}

    public static HarmonicaStrategy getInstance() {
        if(instance == null){
            instance = new HarmonicaStrategy();
        }
        return instance;
    }

    @Override
    public double media(ArrayList<Double> media) {
        double mediaHarmonico = 0;

        for(int i = 0; i < media.size(); i++)
            mediaHarmonico += 1 / media.get(i);

        mediaHarmonico = (5 / mediaHarmonico);
        return mediaHarmonico;
    }
}
