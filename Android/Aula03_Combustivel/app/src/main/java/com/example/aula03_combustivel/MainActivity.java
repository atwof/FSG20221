package com.example.aula03_combustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    private EditText valorGasolina;
    private EditText valorAlcool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txtResultado);
        valorGasolina = findViewById(R.id.inputGasolina);
        valorAlcool = findViewById(R.id.inputAlcool);
    }

    public void calcularOpcao(View v) {

        String opt;

        try {
            double valorAl = Double.parseDouble(valorAlcool.getText().toString());
            double valorGa = Double.parseDouble(valorGasolina.getText().toString());

            double result = valorAl / valorGa;

            if (result <= 0.7) {
                opt = "UTILIZE ÁLCOOL";
            } else {
                opt = "UTILIZE GASOLINA";
            }

            txtResult.setText(opt);

            limpVariable(valorAlcool);
            limpVariable(valorGasolina);

            valorGasolina.requestFocus();

        } catch (Exception e) {
            txtResult.setText("Digite valores para continuar");
        }
    }

    private void limpVariable(EditText e)
    {
        e.setText(null);
    }
}