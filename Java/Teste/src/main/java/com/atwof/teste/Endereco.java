package com.atwof.teste;

/**
 *
 * @author fritzen.alisson
 */
public class Endereco
{
    private int cep;
    private String tipoCep;
    private String subTipoCep;
    private String uf;
    private String cidade;
    private String bairro;
    private String endereco;
    private String complemento;
    private String codigoIbge;
    
    public Endereco()
    {
    }

    public Endereco(int cep, String tipoCep, String subTipoCep, String uf, 
                    String cidade, String bairro, String endereco, String complemento, String codigoIbge)
    {
        this.cep = cep;
        this.tipoCep = tipoCep;
        this.subTipoCep = subTipoCep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.endereco = endereco;
        this.complemento = complemento;
        this.codigoIbge = codigoIbge;
    }

    public int getCep()
    {
        return cep;
    }

    public void setCep(int cep)
    {
        this.cep = cep;
    }

    public String getTipoCep()
    {
        return tipoCep;
    }

    public void setTipoCep(String tipoCep)
    {
        this.tipoCep = tipoCep;
    }

    public String getSubTipoCep()
    {
        return subTipoCep;
    }

    public void setSubTipoCep(String subTipoCep)
    {
        this.subTipoCep = subTipoCep;
    }

    public String getUf()
    {
        return uf;
    }

    public void setUf(String uf)
    {
        this.uf = uf;
    }

    public String getCidade()
    {
        return cidade;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    public String getBairro()
    {
        return bairro;
    }

    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getComplemento()
    {
        return complemento;
    }

    public void setComplemento(String complemento)
    {
        this.complemento = complemento;
    }

    public String getCodigoIbge()
    {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge)
    {
        this.codigoIbge = codigoIbge;
    }
    
}
