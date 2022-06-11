package com.example.appband;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView txtBand, txtMusic, txtDate;
    private Button btnSave, btnList, btnNext;
    private RadioButton radioSertanejo, radioRock, radioOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBand = findViewById(R.id.txtBand);
        txtMusic = findViewById(R.id.txtMusic);
        txtDate = findViewById(R.id.txtDate);

        btnSave = findViewById(R.id.btnSave);
        btnList = findViewById(R.id.btnList);
        btnNext = findViewById(R.id.btnNext);

        radioSertanejo = findViewById(R.id.radioSertanejo);
        radioRock = findViewById(R.id.radioRock);
        radioOther = findViewById(R.id.radioOther);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Band band    = new Band();
                String bandName  = txtBand.getText().toString().trim();
                String music = txtMusic.getText().toString().trim();
                String date  = txtDate.getText().toString().trim();

                // Validar campos nulos
                if(bandName.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Digite um nome", Toast.LENGTH_SHORT).show();
                    txtBand.requestFocus();
                }
                else {
                    band.setName(bandName);
                }

                // Validar campos nulos
                if(music.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Digite uma música", Toast.LENGTH_SHORT).show();
                    txtMusic.requestFocus();
                }
                else {
                    band.setMusic(music);
                }

                // Validar campos nulos
                if(date.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Digite uma data", Toast.LENGTH_SHORT).show();
                    txtDate.requestFocus();
                }
                else {
                    band.setName(date);
                }
            }
        });
    }
}