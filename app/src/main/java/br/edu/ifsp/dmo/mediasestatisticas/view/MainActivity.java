package br.edu.ifsp.dmo.mediasestatisticas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import br.edu.ifsp.dmo.mediasestatisticas.R;

public class MainActivity extends AppCompatActivity {
    private EditText valor_um;
    private EditText valor_dois;
    private EditText valor_tres;
    private EditText valor_quatro;
    private EditText valor_cinco;
    private Button btnAritmetica;
    private Button btnPonderada;
    private Button btnHarmonica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findById();
        setClick();
    }

    public void findById(){
        valor_um = findViewById(R.id.editTextNumeroUm);
        valor_dois = findViewById(R.id.editTextNumeroDois);
        valor_tres = findViewById(R.id.editTextNumeroTres);
        valor_quatro = findViewById(R.id.editTextNumeroquatro);
        valor_cinco = findViewById(R.id.editTextNumeroCinco);
        btnAritmetica = findViewById(R.id.btn_aritmetica);
        btnPonderada = findViewById(R.id.btn_ponderada);
        btnHarmonica = findViewById(R.id.btn_harmonica);
    }

    private void setClick(){
        btnAritmetica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Click Aritmetica");
            }
        });

        btnPonderada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Click Pondetada");
            }
        });

        btnHarmonica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Click Harmonica");
            }
        });
    }

    public void leitura(){}
}