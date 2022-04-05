package com.atwof.aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author fritzen.alisson
 */
public class Ex4
{

    public Ex4()
    {
    }
    
    public void getNumeros()
    {
        // Array List
        List<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 20; i++)
        {
            int v = i * 6;
            numeros.add(v);
        }
        
        numeros.add(9, 99999);
        
        System.out.println("Exercício 4");
        System.out.println("Números informados, em ordem crescente - ArrayList");
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
        
        System.out.println("Números informados, em ordem descrescente - ArrayList");
        for (int i = numeros.size() - 1; i >= 0; i--)
        {
            System.out.print(numeros.get(i) + " ");
        }
        
        // Linked List
        System.out.println("");
        List<Integer> numerosn = new LinkedList<>();
        
        for (int i = 0; i < 20; i++)
        {
            int v = i * 6;
            numerosn.add(v);
        }
        
        numerosn.add(9, 99999);
        System.out.println("");
        
        System.out.println("Números informados, em ordem crescente - LinkedList");
        System.out.println(numerosn);
        Collections.sort(numerosn);
        System.out.println(numerosn);
        
        System.out.println("Números informados, em ordem descrescente - LinkedList");
        for (int i = numerosn.size() - 1; i >= 0; i--)
        {
            System.out.print(numerosn.get(i) + " ");
        }
        
        Collections.reverse(numerosn);
    }
}
