package com.example.aula03_combustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    private TextInputEditText valorGasolina;
    private TextInputEditText valorAlcool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResultado);
        valorGasolina = findViewById(R.id.inputGasolina);
        valorAlcool = findViewById(R.id.inputAlcool);
    }

    public void fecharPrograma(View v)
    {
        System.exit(0);
    }

    public void calcularOpcao(View v)
    {
        String option;

        try
        {
            double valorAl = Double.parseDouble(valorAlcool.getText().toString());
            double valorGa = Double.parseDouble(valorGasolina.getText().toString());

            double result = valorAl / valorGa;

            if (result <= 0.7) {
                option = "UTILIZE ÁLCOOL";
            } else {
                option = "UTILIZE GASOLINA";
            }

            txtResult.setText(option);
        }
        catch(Exception e)
        {
            txtResult.setText("Digite valores para continuar");
        }

    }
}