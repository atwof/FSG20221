package model;

/**
 *
 * @author fritzen.alisson
 */
public class CalcModel
{
    private int resultado;
    
    public void somar(int x, int y)
    {
        resultado = x + y;
    }
    
    public void subtrair(int x, int y)
    {
        resultado = x - y;
    }
    
    public void dividir(int x, int y)
    {
        if(y == 0)
        {
            resultado = 0;
        }
        else
        {
            resultado = x / y;
        }
        
    }
    
    public void multiplicar(int x, int y)
    {
        resultado = x * y;
    }
    
    public int getResultado()
    {
        return resultado;
    }
}
