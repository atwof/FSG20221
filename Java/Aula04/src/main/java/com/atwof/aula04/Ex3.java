package com.atwof.aula04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fritzen.alisson
 */
public class Ex3
{

    public Ex3()
    {
    }
    
    public void getBandas() throws InterruptedException
    {
        List<String> bandas = new ArrayList<>();
        
        System.out.println("Exercício 3");
        System.out.println("Adicionando bandas...");
        Thread.currentThread().sleep(2000);
        
        bandas.add("From First to Last");
        bandas.add("Architects");
        bandas.add("Saviour");
        bandas.add("Euphonik");
        bandas.add("Broadway");
        
        System.out.println("Lista original" + bandas);
        
        System.out.println("Removendo a banda " + bandas.get(2).toUpperCase() + " da lista de bandas");
        bandas.remove(2);
        Thread.currentThread().sleep(2000);
        
        System.out.println("Banda removida!");
        System.out.println("Lista atualizada" + bandas);
    }
    
}
