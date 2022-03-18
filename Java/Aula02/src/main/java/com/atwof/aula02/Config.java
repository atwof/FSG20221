package com.atwof.aula02;

/**
 *
 * @author fritzen.alisson
 */
public class Config 
{
    
    private int memoria;
    private int hd;
    private double processador;

    public Config() 
    {
        
    }
    
    public Config(int memoria, int hd, double processador) 
    {
        this.memoria = memoria;
        this.hd = hd;
        this.processador = processador;
    }

    public int getMemoria() 
    {
        return memoria;
    }

    public void setMemoria(int memoria) 
    {
        this.memoria = memoria;
    }

    public int getHd() 
    {
        return hd;
    }

    public void setHd(int hd) 
    {
        this.hd = hd;
    }

    public double getProcessador() 
    {
        return processador;
    }

    public void setProcessador(double processador) 
    {
        this.processador = processador;
    }
    
}
