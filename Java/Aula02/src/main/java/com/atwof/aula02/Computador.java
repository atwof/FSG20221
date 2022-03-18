package com.atwof.aula02;

/**
 *
 * @author fritzen.alisson
 */
public class Computador extends Custo
{
    
     private String marca;
     private String modelo;
     private double preco;
     private Config config;
     
    public Computador()
    {
        
    }

    public Computador(String marca, String modelo, double preco, Config config) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.config = config;
    }
     
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    public double getPreco()
    {
        return preco;
    }

    public Config getConfig() 
    {
        return config;
    }

    public void setConfig(Config config) 
    {
        this.config = config;
    }
    
    public void imprimirComputador()
    {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço: " + String.format("%,.2f", this.preco));
        System.out.println("HD: " + this.config.getHd());
        System.out.println("Memória: " + this.config.getMemoria());
        System.out.println("Processador: " + String.format("%.2f", this.config.getProcessador()));
    }
    
    public void tempoDeInicializacao()
    {
        System.out.println("Não possui tempo de inicialização");
    }

    @Override
    public double calcularCustoLuz(double processador, String tipo) 
    {
        double valor = 0;
        
        switch(tipo)
        {
            case "D":
                valor = processador * 15;
                break;
        }
        
        return valor;
    }
}
