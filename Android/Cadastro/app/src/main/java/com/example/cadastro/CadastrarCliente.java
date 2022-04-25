package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastrarCliente extends AppCompatActivity {

    private EditText txtName, txtAddress, txtMail;
    private Button btnSave, btnCancel, btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);

        txtName = findViewById(R.id.txtName);
        txtAddress = findViewById(R.id.txtAddress);
        txtMail = findViewById(R.id.txtPhone);
        btnSave = findViewById(R.id.btnSave);
        btnCancel = findViewById(R.id.btnCancel);
        btnReturn = findViewById(R.id.btnReturn);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = txtName.getText().toString().trim();
                String address = txtAddress.getText().toString().trim();
                String mail = txtMail.getText().toString().trim();

                if (name.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Nome não pode ser nulo", Toast.LENGTH_SHORT).show();
                    txtName.requestFocus();
                }
                else
                {
                    DataBase db = new DataBase(getApplicationContext());
                    long result = db.insertClient(name, address, null);

                    if(result == -1)
                    {
                        Toast.makeText(getApplicationContext(), "Erro ao inserir cliente", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Cliente inserido com sucesso", Toast.LENGTH_LONG).show();
                        txtName.setText(null);
                        txtAddress.setText(null);
                        txtMail.setText(null);
                        txtName.requestFocus();
                    }
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName.setText(null);
                txtAddress.setText(null);
                txtMail.setText(null);
                txtName.requestFocus();
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}