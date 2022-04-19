package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin, btnCadastrar;
    EditText txtLogin, txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastrar = findViewById(R.id.btnCadastrar);
        btnLogin = findViewById(R.id.btnLogin);
        txtLogin = findViewById(R.id.txtLogin);
        txtSenha = findViewById(R.id.txtSenha);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DataBase db = new DataBase(MainActivity.this);

                if(db.validateUser(txtLogin.getText().toString().trim(), txtSenha.getText().toString().trim()))
                {
                    txtLogin.setText(null);
                    txtSenha.setText(null);
                    Intent intent = new Intent(getApplicationContext(), Escolhas.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Login inválido", Toast.LENGTH_SHORT).show();
                    txtLogin.requestFocus();
                }
            }
        });

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), CadastrarUser.class);
                startActivity(intent);
            }
        });
    }
}