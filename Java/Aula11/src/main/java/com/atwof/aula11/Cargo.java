/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atwof.aula11;

/**
 *
 * @author fritzen.alisson
 */
public enum Cargo
{
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());
    
    private final RegraDeCalculo regra;
    
    Cargo(RegraDeCalculo regra)
    {
        this.regra = regra;
    }
    
    public RegraDeCalculo getRegra()
    {
        return regra;
    }
}
