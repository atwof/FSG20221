package com.atwof.aula11;

import java.util.Date;

/**
 *
 * @author fritzen.alisson
 */
public class Funcionario
{
    private int id;
    private String nome;
    private Date DataAdmissao;
    private Cargo cargo;
    private double salarioBase;

    public Funcionario()
    {
    }

    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }

    public Funcionario(int id, String nome, Date DataAdmissao, Cargo cargo, double salarioBase)
    {
        this.id = id;
        this.nome = nome;
        this.DataAdmissao = DataAdmissao;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Date getDataAdmissao()
    {
        return DataAdmissao;
    }

    public void setDataAdmissao(Date DataAdmissao)
    {
        this.DataAdmissao = DataAdmissao;
    }

    public Cargo getCargo()
    {
        return cargo;
    }

    public void setCargo(Cargo cargo)
    {
        this.cargo = cargo;
    }

    public double getSalarioBase()
    {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase)
    {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario()
    {
        return cargo.getRegra().calcular(this);
    }
}
