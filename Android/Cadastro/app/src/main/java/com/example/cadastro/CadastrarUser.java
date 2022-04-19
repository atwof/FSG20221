package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastrarUser extends AppCompatActivity {

    EditText txtLoginCadastro, txtSenhaCadastro;
    Button btnSalvarCadastro, btnCancelarCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        txtLoginCadastro = findViewById(R.id.txtLoginCadastro);
        txtSenhaCadastro = findViewById(R.id.txtSenhaCadastro);
        btnSalvarCadastro = findViewById(R.id.btnSalvarCadastro);
        btnCancelarCadastro = findViewById(R.id.btnCancelarCadastro);

        txtLoginCadastro.setText(null);
        txtSenhaCadastro.setText(null);

        btnSalvarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String login = null, senha = null;

                try
                {
                    login = txtLoginCadastro.getText().toString();
                    senha = txtSenhaCadastro.getText().toString();
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Verifique os dados digitados", Toast.LENGTH_SHORT);
                    txtLoginCadastro.requestFocus();
                }

                DataBase db = new DataBase(getApplicationContext());
                db.insertUser(login, senha);
            }
        });

        btnCancelarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnSalvarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txtLoginCadastro.getText().toString().trim() != null &&
                   txtSenhaCadastro.getText().toString().trim() != null)
                {
                    DataBase dataBase = new DataBase(getApplicationContext());
                    if(!dataBase.validateUser(txtLoginCadastro.getText().toString().trim(), null)) {
                        if (dataBase.insertUser(txtLoginCadastro.getText().toString().trim(),
                                txtSenhaCadastro.getText().toString().trim()) == -1) {
                            Toast.makeText(getApplicationContext(), "Erro ao inserir novo usuário", Toast.LENGTH_SHORT).show();
                            txtLoginCadastro.requestFocus();
                        } else {
                            Toast.makeText(getApplicationContext(), "Usuário adicionado!", Toast.LENGTH_SHORT).show();
                            txtLoginCadastro.requestFocus();
                        }

                        txtLoginCadastro.setText(null);
                        txtSenhaCadastro.setText(null);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Usuário já existe", Toast.LENGTH_LONG).show();
                        txtLoginCadastro.requestFocus();
                    }
                };
            }
        });
    }
}