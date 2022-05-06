package com.example.vendasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Pagamento extends AppCompatActivity {

    private EditText txtValorPago;
    private TextView txtTroco;
    private Button btnFinalizarVenda;
    private Spinner comboPagamentos;
    private double valorFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        txtTroco = findViewById(R.id.txtTroco);
        txtValorPago = findViewById(R.id.txtValorPago);
        btnFinalizarVenda = findViewById(R.id.btnFinalizarVenda);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.pagamentos, android.R.layout.simple_spinner_item);
        comboPagamentos.setAdapter(adapter);

        btnFinalizarVenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double valorPago = Double.parseDouble(txtValorPago.getText().toString());
                double troco = valorFinal - valorPago;

                if(troco > 0)
                {
                    txtTroco.setText("Ainda faltam R$ " + troco + "Reais");
                }
                else if(troco < 0)
                {
                    txtTroco.setText("Seu troco é de R$ " + troco * -1 + "Reais");
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Venda finalizada com sucesso", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}