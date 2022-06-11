package com.example.appfindmything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    private TextView txtSalario, txtResultado, txtDescontos;
    private Button btnCalcular;
    private DecimalFormat df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSalario = findViewById(R.id.txtSalario);
        txtResultado = findViewById(R.id.txtResultado);
        txtDescontos = findViewById(R.id.txtDescontos);
        btnCalcular = findViewById(R.id.btnCalcular);
        df = new DecimalFormat("#,###,##0.00");

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    double valor = calcularSalario(Double.parseDouble(txtSalario.getText().toString()),
                            Double.parseDouble(txtDescontos.getText().toString()));
                    txtResultado.setText("Seu salário líquido é de \n"
                                         + df.format(valor) + " reais");
                } catch (Exception ex) {
                    txtResultado.setText("Digite valores válidos");
                    txtSalario.requestFocus();
                }
            }
        });
    }

    private double calcularSalario(double salario, double descontos)
    {
        double valorTotal, vlIR, vlInss = 0;
        double salarioDescontado= salario;

        // Descontar INSS
        if(salario <= 1212)
            vlInss = salario * 0.07;
        else if(salario > 1212 && salario <= 2427.35)
            vlInss = salario * 0.09;
        else if(salario > 2427.35 && salario <= 3641.03)
            vlInss = salario * 0.12;
        else if(salario > 3641.03 && salario <= 7087.22)
            vlInss = salario * 0.14;
        else
            vlIR = 828.39;

        // Descontar IRPF = salario - INSS
        salarioDescontado = salario - vlInss;
        if(salarioDescontado <= 1903.98)
            vlIR = salarioDescontado * 0;
        else if(salarioDescontado > 1903.98 && salarioDescontado <= 2826.65)
            vlIR = (salarioDescontado * 0.075) - 142.80;
        else if(salarioDescontado > 2826.65 && salarioDescontado <= 3751.05)
            vlIR = (salarioDescontado * 0.15) - 354.80;
        else if(salarioDescontado > 3751.05 && salarioDescontado <= 4664.68)
            vlIR = (salarioDescontado * 0.225) - 636.13;
        else
            vlIR = (salarioDescontado * 0.275) - 869.36;

        // Valor Final
        valorTotal = salario - vlInss - vlIR - descontos;

        return valorTotal;
    }
}