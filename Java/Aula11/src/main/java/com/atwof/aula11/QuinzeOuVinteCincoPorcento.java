package com.atwof.aula11;

/**
 *
 * @author fritzen.alisson
 */
public class QuinzeOuVinteCincoPorcento implements RegraDeCalculo
{
    @Override
    public double calcular(Funcionario funcionario)
    {
        if(funcionario.getSalarioBase() > 3000.00)
        {
            return funcionario.getSalarioBase() * 0.75;
        }
        else
        {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
