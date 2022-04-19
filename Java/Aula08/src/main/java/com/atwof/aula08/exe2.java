/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atwof.aula08;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author fritzen.alisson
 */
public class exe2
{
    public static void botao()
    {
        
        JFrame frame = new JFrame();
        frame.setSize(300,80);
        frame.setLocationRelativeTo(frame);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frame.setTitle("Escolha um botão");
        
        JPanel pane = new JPanel();
        frame.add(pane);
        
        JButton btn1 = new JButton();
        btn1.setText("Botão 1");
        pane.add(btn1);
        
        JButton btn2 = new JButton();
        btn2.setText("Botão 2");
        pane.add(btn2);
        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Você cliclou no botão 1", "Botão 1", JOptionPane.PLAIN_MESSAGE);
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Você cliclou no botão 2", "Botão 2", JOptionPane.PLAIN_MESSAGE);
            }
        });
       
        frame.setVisible(true);
        
    }
    
}
