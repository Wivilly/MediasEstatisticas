package br.edu.ifsp.dmo.mediasestatisticas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.ifsp.dmo.mediasestatisticas.R;
import br.edu.ifsp.dmo.mediasestatisticas.model.AritmeticaStrategy;

public class AritmeticaActivity extends AppCompatActivity {
    TextView resultado;
    AritmeticaStrategy aritmeticaStrategy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resultado = findViewById(R.id.textViewAritmetica);

        ArrayList<Double> t = getIntent().getParcelableExtra("keyAritmetica");
        resultado.setText("Resultado: " + aritmeticaStrategy.media(t));
    }
}