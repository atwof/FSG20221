package com.example.aula03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearValor(View v)
    {
        TextView txtView = findViewById(R.id.txtMensagem);
        int valorSorteado = new Random().nextInt(11);
        txtView.setText("O valor sorteado foi: "+ valorSorteado);
    }
}