package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Escolhas extends AppCompatActivity {

    private Button btnCadastrarCliente, btnListarClientes, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolhas);

        btnCadastrarCliente = findViewById(R.id.btnCadastrarCliente);
        btnListarClientes = findViewById(R.id.btnListarClientes);
        btnSair = findViewById(R.id.btnSair);

        btnCadastrarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CadastrarCliente.class);
                startActivity(intent);
            }
        });

        btnListarClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "OPÇÃO NÃO IMPLEMENTADA", Toast.LENGTH_SHORT).show();
            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}