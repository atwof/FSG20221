package com.atwof.aula11;

/**
 *
 * @author fritzen.alisson
 */
public enum Cargo
{
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento()),
    ANALISTA(new DezOuVintePorCento());
    
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
