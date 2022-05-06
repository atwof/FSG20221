package com.example.aula09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox cbFutebol, cbVolei, cbBasquete, cbTenis;
    private Button btnEnviar;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbFutebol = findViewById(R.id.cbFutebol);
        cbBasquete = findViewById(R.id.cbBasquete);
        cbTenis = findViewById(R.id.cbTenis);
        cbVolei = findViewById(R.id.cbVolei);
        btnEnviar = findViewById(R.id.btnEnviar);
        txtResult = findViewById(R.id.txtResult);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String result = null;

                result = "ESPORTES SELECIONADOS:\n\n";

                // Definir o texto que será mostrado
                if (cbFutebol.isChecked()) {
                    result += "FUTEBOL\n";
                } if (cbBasquete.isChecked()) {
                    result += "BASQUETE\n";
                } if (cbVolei.isChecked()) {
                    result += "VÔLEI\n";
                } if (cbTenis.isChecked()) {
                    result += "TÊNIS\n";
                } if (!cbFutebol.isChecked() && !cbBasquete.isChecked() &&
                      !cbVolei.isChecked() && !cbTenis.isChecked()) {
                    result = "NENHUM ESPORTE SELECIONADO";
                }

                // Mostrar selecionados na tela
                txtResult.setText(result);

                // Limpar selecionados
                cbFutebol.setChecked(false);
                cbBasquete.setChecked(false);
                cbVolei.setChecked(false);
                cbTenis.setChecked(false);
            }
        });
    }
}