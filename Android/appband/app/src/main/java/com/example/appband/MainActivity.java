package com.example.appband;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView txtBand, txtMusic, txtDate;
    private Button btnSave, btnList, btnClean;
    private RadioButton radioSertanejo, radioRock, radioOther;
    private List<Band> bandas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBand = findViewById(R.id.txtBand);
        txtMusic = findViewById(R.id.txtMusic);
        txtDate = findViewById(R.id.txtDate);

        btnSave = findViewById(R.id.btnSave);
        btnList = findViewById(R.id.btnList);
        btnClean = findViewById(R.id.btnClean);

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
                    band.setDateRelease(date);
                }

                // Verificar se algum gênero foi selecionado
                if(!radioOther.isChecked() && !radioRock.isChecked() && !radioSertanejo.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Escolha um gênero musical", Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    String result = null;
                    if(radioSertanejo.isChecked())
                    {
                        result = radioSertanejo.getText().toString();
                    }
                    else if(radioRock.isChecked())
                    {
                        result = radioRock.getText().toString();
                    }
                    else
                    {
                        result = radioOther.getText().toString();
                    }
                    band.setStyle(result);
                }

                //Salvar a banda atual
                try
                {
                    bandas.add(band);
                    Toast.makeText(MainActivity.this, "Informações salvas com sucesso", Toast.LENGTH_SHORT).show();
                }
                catch(Exception ex)
                {
                    Toast.makeText(MainActivity.this, "Erro ao salvar informações", Toast.LENGTH_SHORT).show();
                }

                limparCampos();
                txtMusic.requestFocus();
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                limparCampos();

                // Percorrer o array
                for (Band b : bandas)
                {
                    txtMusic.setText(b.getMusic());
                    txtDate.setText(b.getDateRelease());
                    txtBand.setText(b.getName());

                    // Verificar qual estilo está selecionado
                    switch (b.getStyle())
                    {
                        case "Sertanejo":
                            radioSertanejo.setChecked(true);
                            break;
                        case "Rock":
                            radioRock.setChecked(true);
                            break;
                        default:
                            radioOther.setChecked(true);
                            break;
                    }
                }
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limparCampos();
            }
        });
    }

    public void limparCampos()
    {
        txtMusic.setText(null);
        txtBand.setText(null);
        txtDate.setText(null);
        radioRock.setChecked(false);
        radioSertanejo.setChecked(false);
        radioOther.setChecked(false);
    }
}