package com.example.projetoimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText txtPeso;
    private EditText txtAltura;
    private TextView txtResultadoTexto;
    private TextView txtResultadoValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
        txtResultadoValor = findViewById(R.id.txtResultadoValor);
    }

    public void calcularImc(View v)
    {
        String texto;

        try
        {
            double valorPeso = Double.parseDouble(txtPeso.getText().toString());
            double valorAltura = Double.parseDouble(txtAltura.getText().toString());

            double resultadoImc = valorPeso / (valorAltura * valorAltura);

            if(resultadoImc < 18.5)
            {
                texto = "MAGREZA";
            }
            else if(resultadoImc >= 18.5 && resultadoImc <= 24.9)
            {
                texto = "NORMAL";
            }
            else if(resultadoImc >= 25 && resultadoImc <= 29.9)
            {
                texto = "SOBREPESO";
            }
            else if(resultadoImc >= 30 && resultadoImc <= 39.9)
            {
                texto = "OBESIDADE";
            }
            else
            {
                texto = "OBESIDADE GRAVE";
            }

            DecimalFormat df = new DecimalFormat("#.##");
            txtResultadoValor.setText("SEU IMC É: " + df.format(resultadoImc) + " / " +
                                      "SEU NÍVEL É: " + texto);

            txtPeso.setText(null);
            txtAltura.setText(null);
            txtPeso.requestFocus();
        }
        catch(Exception e)
        {
            txtResultadoValor.setText("Digite valores para continuar");
            txtPeso.requestFocus();
        }
        txtPeso.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(txtPeso.hasFocus())
                {
                    txtResultadoValor.setText(null);
                    return false;
                };
                return true;
            }
        });
    }
}