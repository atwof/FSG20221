package com.atwof.aula05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author fritzen.alisson
 */
public class Exercicio1
{
    public static void Exe1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String[] texto = sc.nextLine().split(" ");
        
        Set<String> palavras = new HashSet<>();
        for(String item : texto)
        {
            palavras.add(item);
        }
        
        int total = 0;
        for(String i : palavras)
        {   
            int cont = 0;
            for (int j = 0; j < texto.length; j++)
            {
                if(i.equals(texto[j]))
                {
                    cont++;
                }
            }
            
            if(cont == 1)
            {
                total++;
            }
        }
        
        System.out.println("Quantidade de palavras não repetidas: " + total);
    }
}
