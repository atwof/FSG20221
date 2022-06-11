package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnPedra, btnPapel, btnTesoura;
    private TextView txtResultado;
    private String opcao = null;
    private String valorSorteado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPedra   = findViewById(R.id.btnPedra);
        btnPapel   = findViewById(R.id.btnPapel);
        btnTesoura = findViewById(R.id.btnTesoura);
        txtResultado = findViewById(R.id.txtResultado);

        btnPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorSorteado = sortear();
                opcao = Jogada.PEDRA.getDescricao();
                txtResultado.setText("VOCÊ " + verificarJogada(opcao, valorSorteado) + "\n\n" +
                                    "SUA OPÇÃO: " + opcao + "\n" +
                                    "OPÇÃO SORTEADA: " + valorSorteado);
            }
        });

        btnPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorSorteado = sortear();
                opcao = Jogada.PAPEL.getDescricao();
                txtResultado.setText("VOCÊ " + verificarJogada(opcao, valorSorteado) + "\n\n" +
                        "SUA OPÇÃO: " + opcao + "\n" +
                        "OPÇÃO SORTEADA: " + valorSorteado);
            }
        });

        btnTesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorSorteado = sortear();
                opcao = Jogada.TESOURA.getDescricao();
                txtResultado.setText("VOCÊ " + verificarJogada(opcao, valorSorteado) + "\n\n" +
                        "SUA OPÇÃO: " + opcao + "\n" +
                        "OPÇÃO SORTEADA: " + valorSorteado);
            }
        });
    }

    private static String sortear()
    {
        String jogada = null;
        Random gerador = new Random();

        switch(gerador.nextInt(3))
        {
            case 0:
                jogada = Jogada.PEDRA.getDescricao();
                break;
            case 1:
                jogada = Jogada.PAPEL.getDescricao();
                break;
            case 2:
                jogada = Jogada.TESOURA.getDescricao();
                break;
        }

        return jogada;

    }

    private static String verificarJogada(String opc, String sorteado)
    {
        String resultadoFinal = null;

        if((opc == Jogada.PEDRA.getDescricao() && sorteado == Jogada.TESOURA.getDescricao()) ||
           (opc == Jogada.PAPEL.getDescricao() && sorteado == Jogada.PEDRA.getDescricao()) ||
           (opc == Jogada.TESOURA.getDescricao() && sorteado == Jogada.PAPEL.getDescricao()))
        {
            resultadoFinal = "GANHOU";
        }
        else if((opc == Jogada.TESOURA.getDescricao() && sorteado == Jogada.PEDRA.getDescricao()) ||
                (opc == Jogada.PEDRA.getDescricao() && sorteado == Jogada.PAPEL.getDescricao()) ||
                (opc == Jogada.PAPEL.getDescricao() && sorteado == Jogada.TESOURA.getDescricao()))
        {
            resultadoFinal = "PERDEU";
        }
        else
        {
            resultadoFinal = "EMPATOU";
        }

        return resultadoFinal;
    }

    public enum Jogada
    {
        PEDRA("PEDRA"),
        PAPEL("PAPEL"),
        TESOURA("TESOURA");

        private String descricao;

        Jogada(String descricao)
        {
            this.descricao = descricao;
        }

        public String getDescricao()
        {
            return this.descricao;
        }
    }
}