package com.example.aula03_combustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularOpcao(View v)
    {
        double resutado;
        String opcao;

        TextView txtResultado = findViewById(R.id.txtResultado);
        TextInputEditText valorGasolina = findViewById(R.id.inputGasolina);
        TextInputEditText valorAlcool = findViewById(R.id.inputAlcool);

        double valorAl = Double.valueOf(valorAlcool.getText().toString());
        double valorGa = Double.valueOf(valorGasolina.getText().toString());

        resutado = valorAl / valorGa;

        if(resutado <= 0.7)
        {
            opcao = "UTILIZE ÁLCOOL";
        }
        else
        {
            opcao = "UTILIZE GASOLINA";
        }

        txtResultado.setText(opcao);
    }
}