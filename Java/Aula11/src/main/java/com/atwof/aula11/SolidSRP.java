package com.atwof.aula11;

import java.util.Calendar;

/**
 *
 * @author fritzen.alisson
 */
public class SolidSRP
{
    public static void main(String[] args)
    {
        Funcionario teste = new Funcionario();
        teste.setId(1);
        teste.setNome("Alisson");
        teste.setCargo(Cargo.ANALISTA);
        teste.setSalarioBase(5000);
        
        Calendar c = Calendar.getInstance();
        c.set(2022, 11, 30);
        
        System.out.println(teste.getNome() + " foi admitido em " + c.get(Calendar.YEAR) 
                          + " e tem um salário de " + teste.calcularSalario());
    }
}
