package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastrarCliente extends AppCompatActivity {

    EditText txtName, txtAddress, txtPhone;
    Button btnSave, btnCancel, btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_cliente);

        txtName = findViewById(R.id.txtName);
        txtAddress = findViewById(R.id.txtAddress);
        txtPhone = findViewById(R.id.txtPhone);
        btnSave = findViewById(R.id.btnSave);
        btnCancel = findViewById(R.id.btnCancel);
        btnReturn = findViewById(R.id.btnReturn);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = txtName.getText().toString().trim();
                String address = txtAddress.getText().toString().trim();
                String phone = txtPhone.getText().toString().trim();

                if (name.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Nome não pode ser nulo", Toast.LENGTH_SHORT).show();
                    txtName.requestFocus();
                }
                else
                {
                    DataBase db = new DataBase(getApplicationContext());
                    long result = db.insertClient(name, address, phone);

                    if(result == -1)
                    {
                        Toast.makeText(getApplicationContext(), "Erro ao inserir cliente", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Cliente inserido com sucesso", Toast.LENGTH_LONG);
                    }
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName.setText(null);
                txtAddress.setText(null);
                txtPhone.setText(null);
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