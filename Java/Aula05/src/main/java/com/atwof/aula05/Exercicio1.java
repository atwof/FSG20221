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
        Set<String> palavras = new HashSet<>();
        
        System.out.println("Digite uma frase: ");
        String[] texto = sc.nextLine().split(" ");
        
        for(String item : texto)
        {
            palavras.add(item);
        }
        
        Iterator<String> i = palavras.iterator();
        for(int j = 0; j < palavras.size(); j++)
        {
            int cont = 0;
            
            while(i.hasNext())
            {
                if(palavras.contains(j))
                {
                    cont += 1;
                }
            }
            
            if(cont == 1)
            {
                System.out.println(i);
            }
        }
    }
}
