package br.edu.ifsp.dmo.mediasestatisticas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.ifsp.dmo.mediasestatisticas.R;
import br.edu.ifsp.dmo.mediasestatisticas.model.HarmonicaStrategy;

public class HarmonicaActivity extends AppCompatActivity {
    TextView resultado;
    HarmonicaStrategy harmonicaStrategy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resultado = findViewById(R.id.textViewHarmonica);

        ArrayList<Double> t = getIntent().getParcelableExtra("keyHarmonica");
        resultado.setText("Resultado: " + harmonicaStrategy.media(t));
    }
}