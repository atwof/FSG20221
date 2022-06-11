package com.atwof.appcalculadora;

/**
 *
 * @author fritzen.alisson
 */
public class Operacoes
{
    public static String somar(String current, String valor)
    {
        double resultado;
        resultado = Double.parseDouble(current) + Double.parseDouble(valor);
        return Double.toString(resultado);
    }
    
    public static String subtrair(String current, String valor)
    {
        double resultado;
        resultado = Double.parseDouble(current) - Double.parseDouble(valor);
        return Double.toString(resultado);
    }
    
    public static String dividir(String current, String valor)
    {
        double valorDivisao = 0;
        
        if (Double.parseDouble(valor) == 0)
        {
            valorDivisao = 0;
        }
        else
        {
           valorDivisao = Double.parseDouble(current) / Double.parseDouble(valor); 
        }
        
        return Double.toString(valorDivisao);
    }
    
    public static String multiplicar(String current, String valor)
    {
        double resultado;
        resultado = Double.parseDouble(current) * Double.parseDouble(valor);
        return Double.toString(resultado);
    }
    
    public static String adicionarValor(String current, String valor)
    {
        try{
            switch(valor)
            {
                case ".":
                    if(!current.contains("."))
                        current += valor;
                    break;
                case "-":
                    if(!current.contains("-"))
                        current += valor;
                    break;
                case "+":
                    if(!current.contains("+"))
                        current += valor;
                    break;
                case "/":
                    if(!current.contains("/"))
                        current += valor;
                    break;
                case "x":
                    if(!current.contains("x"))
                        current += valor;
                    break;
                default:
                    current += valor;
                    break;
            }
        }
        catch(Exception e)
        {}
        return current;
        
    }
    
    public static String porcentagem(String current)
    {
        double resultado;
        resultado = Double.parseDouble(current) / 100;
        return Double.toString(resultado);
    }
}
