package com.atwof.aula02;

/**
 *
 * @author fritzen.alisson
 */
public class Desktop extends Computador implements Autenticavel
{
    private boolean doisMonitores;
    private int qtdPerifericos;
    private String opc = "NÃO";
    private final int senha = 777;

    public Desktop() 
    {
        
    }
    
    public Desktop(String marca, String modelo, double preco, Config config, boolean doisMonitores, int qtdPerifericos) 
    {
        super(marca, modelo, preco, config);
        this.doisMonitores = doisMonitores;
        this.qtdPerifericos = qtdPerifericos;
    }

    public boolean getDoisMonitores() 
    {
        return doisMonitores;
    }

    public void setDoisMonitores(boolean doisMonitores) 
    {
        this.doisMonitores = doisMonitores;
    }

    public int getQtdPerifericos() 
    {
        return qtdPerifericos;
    }

    public void setQtdPerifericos(int qtdPerifericos) 
    {
        this.qtdPerifericos = qtdPerifericos;
    }
    
    public boolean rodaJogosPesados(double processador)
    {
        boolean run = false;
        
        if(processador >= 2.0)
        {
            run = true;
        }
        
        return run;
    }
    
    public void imprimirDesktop()
    {
        // Verifica se possui dois monitores
        if(this.doisMonitores)
        {
            opc = "SIM";
        }
        
        super.imprimirComputador();
        System.out.println("Possui dois monitores: " + opc);
        System.out.println("Quantidade de periféricos: " + this.qtdPerifericos);
    }
    
    @Override
    public void tempoDeInicializacao()
    {
        System.out.println("O desktop leva 5 segundos para inicializar.");
    }

    @Override
    public boolean autenticar(int senha) 
    {
        if(this.senha == senha)
        {
            return true;
        }
        
        return false;
    }
    
}
