package com.example.aula05;

import androidx.annotation.ArrayRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    private EditText txtAge;
    private TextView txtResult;
    private Spinner txtPorte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAge = findViewById(R.id.txtAge);
        txtResult = findViewById(R.id.txtResult);
        txtPorte = findViewById(R.id.txtPorte);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.portes, android.R.layout.simple_spinner_item);
        txtPorte.setAdapter(adapter);
    }

    public void CalcularIdade(View v)
    {

        try
        {
            String opc = txtPorte.getSelectedItem().toString();
            int age = Integer.parseInt(txtAge.getText().toString());
            int dogAge = 0;

            if(opc.contentEquals("Small"))
            {
                dogAge = age * 3;
            }
            else if(opc.contentEquals("Medium"))
            {
                dogAge = age * 5;
            }
            else
            {
                dogAge = age * 7;
            }

            txtResult.setText("A idade do doguinho em anos humanos é " + dogAge);
        }
        catch(Exception e)
        {
            txtResult.setText("Digite um valor válido");
            txtAge.requestFocus();
        }

        txtAge.setText(null);
        txtAge.requestFocus();
    }
}