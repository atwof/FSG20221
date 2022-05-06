package com.atwof.aula09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author fritzen.alisson
 */
public class Exe1
{
    private static JTextField fieldTxt = new JTextField();
    
    public static void SelecionarText()
    {
        JFrame frame = new JFrame();
        frame.setTitle("Exercício 1");
        frame.setSize(300, 200);
        frame.setLocation(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JLabel lblTexto = new JLabel();
        lblTexto.setText("Digite alguma coisa");
        panel.add(lblTexto);
        
        fieldTxt.setColumns(20);
        panel.add(fieldTxt);
        
        JButton btnEvento = new JButton();
        btnEvento.setText("Mostrar");
        panel.add(btnEvento);
        
        btnEvento.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String mensagem;
                
                if(fieldTxt.getText().isBlank())
                {
                    mensagem = "Nada foi digitado";
                }
                else
                {
                    mensagem = fieldTxt.getText();
                }
                JOptionPane.showMessageDialog(null, mensagem, "Botão para mensagem", JOptionPane.PLAIN_MESSAGE);
                fieldTxt.setText(null);
                fieldTxt.requestFocus();
            }
        });
        
        frame.setVisible(true);
    }
}