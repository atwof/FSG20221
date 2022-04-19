package com.atwof.aula05;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.nanoTime;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author fritzen.alisson
 */
public class Exercicio3
{
    public static void Exe1()
    {
        long array  = 10000000;
        long valor  = 500000;
        long indice = 870659;
        
        System.out.println("TEMPOS\n");
        
        System.out.println("INSERT DE 0 ATÉ " + array + "\n"
                         + "HASHSET: " + insert('h', array) + " MILISEGUNDOS\n"
                         + "TREESET: " + insert('t', array) + " MILISEGUNDOS\n");
        
        System.out.println("DELETE DE " + valor + "\n"
                         + "HASHSET: " + del('h', valor, array) + " MILISEGUNDOS\n"
                         + "TREESET: " + del('t', valor, array) + " MILISEGUNDOS\n");
        
        System.out.println("GET VALOR " + indice + "\n"
                         + "HASHSET: " + get('h', indice, array) + " MILISEGUNDOS\n"
                         + "TREESET: " + get('t', indice, array) + " MILISEGUNDOS\n");
    }
    
    private static int insert(char opc, long valor)
    {
        int result = 0;
        
        switch (opc)
        {
            case 'h':
                Set<Integer> numH= new HashSet<>();
                
                long beginH = currentTimeMillis();
                
                for (int i = 0; i < valor; i++)
                {
                    numH.add(i);
                }
                
                long endH = currentTimeMillis();
                
                result = (int) (endH - beginH);
                
                break;
            case 't':
                Set<Integer> numT = new TreeSet<>();
                
                long beginT = currentTimeMillis();
                
                for (int i = 0; i < valor; i++)
                {
                    numT.add(i);
                }
                
                long endT = currentTimeMillis();
                
                result = (int) (endT - beginT);
                
                break;
        }
        
        return result;
    }
    
    private static int del(char opc, long valor, long array)
    {
        int result = 0;
        int[] arr = null;
        
        switch (opc)
        {
            case 'h':
                Set<Integer> numH= new HashSet<>();
                
                for (int i = 0; i < array; i++)
                {
                    numH.add(i);
                }
                
                long beginH = currentTimeMillis();
                
                for (int k = 0; k < valor; k++)
                {
                    numH.remove(k);
                }
                
                long endH = currentTimeMillis();
                
                result = (int) (endH - beginH);
                
                break;
            case 't':
                Set<Integer> numT = new TreeSet<>();
                
                for (int i = 0; i < array; i++)
                {
                    numT.add(i);
                }
                
                long beginT = currentTimeMillis();
                
                for (int k = 0; k < valor; k++)
                {
                    numT.remove(k);
                }
                
                long endT = currentTimeMillis();
                
                result = (int) (endT - beginT);
                
                break;
        }
        
        return result;
    }
    
    private static int get(char opc, long valor, long array)
    {
        int result = 0;
        int[] arr = null;
        
        switch (opc)
        {
            case 'h':
                Set<Integer> numH= new HashSet<>();
                
                for (int i = 0; i < array; i++)
                {
                    numH.add(i);
                }
                
                long beginH = currentTimeMillis();
                
                for (int k = 0; k < array; k++)
                {
                    if(k == valor)
                    {
                        break;
                    }
                }
                
                long endH = currentTimeMillis();
                
                result = (int) (endH - beginH);
                
                break;
            case 't':
                Set<Integer> numT = new TreeSet<>();
                
                for (int i = 0; i < array; i++)
                {
                    numT.add(i);
                }
                
                long beginT = currentTimeMillis();
                
                for (int k = 0; k < array; k++)
                {
                    if(k == valor)
                    {
                        break;
                    }
                }
                
                long endT = currentTimeMillis();
                
                result = (int) (endT - beginT);
                
                break;
        }
        
        return result;
    }
}
