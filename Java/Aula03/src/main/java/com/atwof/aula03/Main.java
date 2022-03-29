package com.atwof.aula03;

/**
 *
 * @author fritzen.alisson
 */
public class Main
{
    public static void main(String[] args)
    {
        // Exercício 1
        System.out.println("A nota foi " + retornarNota(7.8));
        
        // Exercício 2
        // Torna a manutenção mais fácil;
        // Torna o código mais fácil de ler;
        // Códigos com chances menores de erro por alteração.
        
        // Exercício 3
        System.out.println("O primeiro dia da semana é " + diasDaSemana.PRIMEIRO.getDiaSemana());
        
        // Exercício 4
        System.out.println("Outubro é o " + meses.OUTUBRO.getMes() +  " mês do ano");
        
        // Exercício 5
        if(confirma.FALSE.getConfirma())
        {
            System.out.println("Confirmou!");
        }
        else
        {
            System.out.println("Não confirmou!");
        }
        
        // Exercício 6
        System.out.println("As modalidades presentes no evento foram: " + esporte.FUTEBOL.getOpcao() + ", " 
                                                                        + esporte.DANCA.getOpcao() + " e "
                                                                        + esporte.NATACAO.getOpcao());       
    }
    
    public static char retornarNota(double valor)
    {
       char n;
       
       if(valor >= 9.00)
       {
           n = 'A';
       }
       else if(valor >= 8.00 && valor < 9.00)
       {
           n = 'B';
       }
       else if(valor >= 6.50 && valor < 8.00)
       {
           n = 'C';
       }
       else if(valor >= 5.00 && valor < 6.5)
       {
           n = 'D';
       }
       else
       {
           n = 'E';
       }
       
       return n;
    }
    
    public enum diasDaSemana
    {
        PRIMEIRO("DOMINGO"),
        SEGUNDO("SEGUNDA"),
        TERCEIRO("TERÇA"),
        QUARTO("QUARTA"),
        QUINTO("QUINTA"),
        SEXTO("SEXTA"),
        SETIMO("SABADO");
        
        private String diaSemana;
        
        diasDaSemana(String dia)
        {
            this.diaSemana = dia;
        }
        
        public String getDiaSemana()
        {
            return diaSemana;
        }
    }
    
    public enum meses
    {
        JANEIRO(1),
        FEVEREIRO(2),
        MARCO(3),
        ABRIL(4),
        MAIO(5),
        JUNHO(6),
        JULHO(7),
        AGOSTO(8),
        SETEMBRO(9),
        OUTUBRO(10),
        NOVEMBRO(11),
        DEZEMBRO(12);
        
        private int mes;
        
        meses(int m)
        {
            this.mes = m;
        }
        
        public int getMes()
        {
            return mes;
        }
    }
    
    public enum confirma
    {
        TRUE(true),
        FALSE(false);
        
        private boolean valor;
        
        confirma(boolean v)
        {
            this.valor = v;
        }
        
        public boolean getConfirma()
        {
            return valor;
        }
    }
    
    public enum esporte
    {
        FUTEBOL(1),
        VOLEI(2),
        NATACAO(3),
        DANCA(4),
        ATLETISMO(5);
        
        public int opcao;
        
        esporte(int opc)
        {
            this.opcao = opc;
        }
        
        public int getOpcao()
        {
            return opcao;
        }
    }
}
