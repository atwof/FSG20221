package com.atwof.aula04;

/**
 *
 * @author fritzen.alisson
 */
public class main
{
    public static void main(String[] args) throws InterruptedException
    {
        // Lista de valores aleatórios
        Ex1 ex1 = new Ex1();
        ex1.mostrarValores();
        
        System.out.println("");
        
        // Lista de nomes ordenados na ordem inversa à digitada
        Ex2 ex2 = new Ex2();
        ex2.getNomes();
        
        System.out.println("");
        
        // Adicionar e remover bandas
        Ex3 ex3 = new Ex3();
        ex3.getBandas();
        
        System.out.println("");
        
        // Uso de array list, linked list, ordenação e reversão
        Ex4 ex4 = new Ex4();
        ex4.getNumeros();
            
    }
 
}
