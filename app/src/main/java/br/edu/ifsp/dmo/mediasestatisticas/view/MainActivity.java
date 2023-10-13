package br.edu.ifsp.dmo.mediasestatisticas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

    ArrayList<Double> numeros;
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
                Intent intent = new Intent(MainActivity.this, AritmeticaActivity.class);
                intent.putExtra("keyAritmetica", numeros);
                startActivity(intent);
            }
        });

        btnPonderada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AritmeticaActivity.class);
                intent.putExtra("keyPonderada", numeros);
                startActivity(intent);
            }
        });

        btnHarmonica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AritmeticaActivity.class);
                intent.putExtra("keyHarmonica", numeros);
                startActivity(intent);
            }
        });
    }

    public ArrayList<Double> leitura() throws NumberFormatException{
        try {
            numeros.add(Double.parseDouble(valor_um.getText().toString()));
            numeros.add(Double.parseDouble(valor_dois.getText().toString()));
            numeros.add(Double.parseDouble(valor_tres.getText().toString()));
            numeros.add(Double.parseDouble(valor_quatro.getText().toString()));
            numeros.add(Double.parseDouble(valor_cinco.getText().toString()));
        }catch (NumberFormatException ex){
            Toast.makeText(this, "Erro na leitura de dados.", Toast.LENGTH_SHORT).show();
        }
        return numeros;
    }
}