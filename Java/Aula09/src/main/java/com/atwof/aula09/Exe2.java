package com.atwof.aula09;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author fritzen.alisson
 */
public class Exe2
{
    static void acoes() {
     
        // Janela
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setLocation(500,200);
        frame.setTitle("Exercício 2");
        
        // Painel
        JPanel panel = new JPanel();
        frame.add(panel);
        
        // Título do painel
        JLabel lbl1 = new JLabel();
        lbl1.setText("Exercío 2, com algumas ações\n");
        panel.add(lbl1);
       
        // Botões
        JButton btn1 = new JButton();
        btn1.setText("Botão 1");
        panel.add(btn1);
        
        // Habilitar janela
        frame.setVisible(true);
                
        
    }
            
}
