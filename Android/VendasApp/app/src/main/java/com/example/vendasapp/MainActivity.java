package com.example.vendasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtValor, txtDesconto;
    private Button btnPagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValor = findViewById(R.id.txtValor);
        txtDesconto = findViewById(R.id.txtDesconto);
        btnPagar = findViewById(R.id.btnPagar);

        btnPagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor = 0;
                double valorDesconto = 0;
                double valorFinal = 0;

                try
                {
                    valor = Double.parseDouble(txtValor.getText().toString());
                    valorDesconto = Double.parseDouble(txtDesconto.getText().toString());
                }
                catch(Exception ex)
                {
                    Toast.makeText(getApplicationContext(),"Digite valores válidos", Toast.LENGTH_SHORT).show();
                    txtValor.requestFocus();
                }

                if (valorDesconto < 0 || valor == 0) {
                    Toast.makeText(getApplicationContext(), "Digite valores válidos", Toast.LENGTH_SHORT).show();
                    txtValor.requestFocus();
                } else {
                    valorFinal = Math.round(valor - (valor * (valorDesconto / 100)));
                    txtValor.setText(null);
                    txtDesconto.setText(null);
                    Intent intent = new Intent(getApplicationContext(), Pagamento.class);
                    intent.putExtra("valorFinal", valorFinal);
                    startActivity(intent);
                }
            }
        });
    }
}