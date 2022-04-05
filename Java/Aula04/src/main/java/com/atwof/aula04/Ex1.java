package com.atwof.aula04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fritzen.alisson
 */
public class Ex1
{

    public Ex1()
    {
    }
    
    public void mostrarValores()
    {
        List valores = new ArrayList<>();
        
        for (int i = 0; i < 5; i++)
        {
            double v = i * 6.5;
            
            valores.add(v);
        }
        
        System.out.println("Exercício 1\nValores informados:\n" + valores);
    }
}
