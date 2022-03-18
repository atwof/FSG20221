package com.atwof.aula02;

import java.text.DecimalFormat;

/**
 *
 * @author fritzen.alisson
 */
public class Main {
    
    public static void main(String[] args) 
    {
       
        System.out.println("ENCAPSULAMENTO");
        // Construtor com parâmetro
        //Computador c1 = new Computador("Apple", "Macbook Pro", 10000.00);
        
        // Construtor sem parâmetro
        Computador c1 = new Computador();
        
        c1.setMarca("Apple");
        c1.setModelo("Macbook Pro");
        c1.setPreco(10000.90);
        
        System.out.println("O modelo " + c1.getModelo() + ", da empresa " + c1.getMarca() + 
                           ", está custando R$ " + String.format("%,.2f", c1.getPreco()) + ".");
        
        System.out.println("\nRELACIONAMENTO");
        
        Config co1 = new Config();
        
        co1.setHd(500);
        co1.setMemoria(16);
        co1.setProcessador(3.5);

        Computador c2 = new Computador();
        
        c2.setMarca("Dell");
        c2.setPreco(7000);
        c2.setConfig(co1);
        
        System.out.println("Os computadores da " + c2.getMarca() + " com " + c2.getConfig().getMemoria() + " Gb de RAM, "
                         + c2.getConfig().getHd() + " Gb de HD e processador de " + String.format("%.2f", c2.getConfig().getProcessador()) + " Ghz "
                         + "custam, em média, R$ " + String.format("%,.2f", c2.getPreco()) + ".");
        
        System.out.println("\nHERANÇA");
        
        Desktop d1 = new Desktop("Apple", "Macbook Air", 4500.00, co1, true, 6);
        
        if(d1.rodaJogosPesados(c2.getConfig().getProcessador()))
        {
            System.out.println("O computador 2 roda jogos pesados");
        }
        else
        {
            System.out.println("O computador 2 não roda jogos pesados");
        }
        
        d1.imprimirDesktop();
        
        System.out.println("\nPOLIMORFISMO");
        
        Computador c3 = new Desktop();
        
        c3.tempoDeInicializacao();
        
        System.out.println("\nCLASSES ABSTRATAS");
        
        Custo c = new Computador();
        double custo = d1.calcularCustoLuz(c2.getConfig().getProcessador(), "D");
        
        System.out.println("O custo de luz do computador é: " + String.format("%.2f", custo)+ " reais.");
        
        System.out.println("\nINTERFACE");
        
        Desktop di = new Desktop();
        
        System.out.println("Autenticou: " + di.autenticar(777));

    }
}
