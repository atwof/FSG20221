package com.atwof.aula05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author fritzen.alisson
 */
public class Exercicio2
{
    public static void Exe1(){
        
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> cores = new HashMap<>();

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine().toUpperCase();

        String[] valores = frase.split(" ");

        for(String valor : valores)
        {
            cores.put(valor, 0);
        }

        for(String item : valores)
        {
            if(cores.containsKey(item))
            {
                cores.put(item, cores.get(item) + 1);
            }
        }

        System.out.println("\nRESULTADO");
        for(Map.Entry<String, Integer> entry : cores.entrySet())
        {
            System.out.println(entry.getKey() + " - Quantidade: " + entry.getValue());
        }
    }
}
