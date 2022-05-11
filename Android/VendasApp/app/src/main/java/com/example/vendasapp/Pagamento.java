package com.example.vendasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Pagamento extends AppCompatActivity {

    DecimalFormat df = new DecimalFormat("#,###,###.00");
    private EditText txtValorPago;
    private Button btnFinalizarVenda;
    private Spinner comboPagamentos;
    private double valorFinal;
    private TextView txtValorDevido;
    private Intent intent;
    private Bundle extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        txtValorPago = findViewById(R.id.txtValorPago);
        txtValorDevido = findViewById(R.id.txtValorDevido);
        btnFinalizarVenda = findViewById(R.id.btnFinalizarVenda);
        comboPagamentos = findViewById(R.id.comboPagamentos);
        intent = getIntent();
        extra = intent.getExtras();

        if(extra != null)
        {
            valorFinal = extra.getDouble("valorFinal");
            txtValorDevido.setText("Valor devido: R$ " + df.format(valorFinal) + " Reais");
        }

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.pagamentos, android.R.layout.simple_spinner_item);
        comboPagamentos.setAdapter(adapter);

        btnFinalizarVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double valorPago = Double.parseDouble(txtValorPago.getText().toString());
                double troco = Math.round(valorFinal - valorPago);

                if(troco > 0)
                {
                    Toast.makeText(getApplicationContext(), "Ainda faltam R$ " + df.format(troco) + " Reais", Toast.LENGTH_LONG).show();
                }
                else if(troco < 0)
                {
                    Toast.makeText(getApplicationContext(), "Seu troco é de R$ " + df.format(troco * -1) + " Reais\nObrigado pela compra!", Toast.LENGTH_LONG).show();
                    finish();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Venda finalizada com sucesso\nObrigado pela compra!", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }
}