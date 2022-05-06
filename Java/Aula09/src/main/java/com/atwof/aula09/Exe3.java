package com.atwof.aula09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author fritzen.alisson
 */
public class Exe3
{
    static void EventoFecharJanela() 
    {
        
        JFrame janela = new JFrame ("Exemplo Botão Fechar");
        janela.setSize(300,100);
        janela.setLocation(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        JPanel painel = new JPanel();
        janela.getContentPane().add(painel);
        
        JButton botaoFecha = new JButton("Fechar");
        painel.add(botaoFecha);
        
        botaoFecha.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                janela.dispose();
            }
        });
        
        janela.setVisible(true);
        
    }
}
