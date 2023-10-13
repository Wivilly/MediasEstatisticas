package br.edu.ifsp.dmo.mediasestatisticas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import br.edu.ifsp.dmo.mediasestatisticas.R;
import br.edu.ifsp.dmo.mediasestatisticas.model.PonderadaStrategy;

public class PonderadaActivity extends AppCompatActivity {

    TextView resultado;
    PonderadaStrategy ponderadaStrategy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resultado = findViewById(R.id.textViewPonderada);

        ArrayList<Double> t = getIntent().getParcelableExtra("keyPonderada");
        resultado.setText("Resultado: " + ponderadaStrategy.media(t));
    }
}