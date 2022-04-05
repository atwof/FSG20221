package com.atwof.aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fritzen.alisson
 */
public class Ex2
{

    public Ex2()
    {
    }
    
    public void getNomes()
    {
        Scanner sc1 = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++)
        {
            nomes.add(sc1.nextLine());
        }
        
        System.out.println("\nExercício 2\nNomes informados, porém em ordem inversa:");
        for (int i = nomes.size() - 1; i >= 0; i--)
        {
            System.out.print(nomes.get(i) + " ");
        }
        
        System.out.println("");
    }
}
